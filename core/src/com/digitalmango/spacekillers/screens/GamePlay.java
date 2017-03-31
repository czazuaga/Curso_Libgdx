package com.digitalmango.spacekillers.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.graphics.GL20;
import com.digitalmango.spacekillers.MainGame;
import com.digitalmango.spacekillers.entities.EntitiesManager;
import com.digitalmango.spacekillers.entities.Player;
import com.digitalmango.spacekillers.tools.BaseScreen;
import com.digitalmango.spacekillers.tools.PlayerInputProcessor;

/**
 * Created by Carlos Zamora on 30/03/2017.
 */

public class GamePlay extends BaseScreen {

    private MainGame mainGame;
    public Player player;

    private InputMultiplexer inputMultiplexer;
    private PlayerInputProcessor playerInputProcessor;

    public EntitiesManager entitiesManager;


    public GamePlay(Game game, MainGame mainGame) {
        super(game);
        this.mainGame = mainGame;

        player = new Player(this.mainGame, (MainGame.SCREEN_WIDTH / 2) - (16 / 2), 20f);

        //Input management
        playerInputProcessor = new PlayerInputProcessor(player);
        inputMultiplexer = new InputMultiplexer();
        inputMultiplexer.addProcessor(playerInputProcessor);

        entitiesManager = new EntitiesManager(mainGame);

    }

    @Override
    public void show() {
        Gdx.input.setInputProcessor(inputMultiplexer);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.setProjectionMatrix(camera.combined);
        camera.update();

        batch.begin();
        entitiesManager.update(batch, delta);
        player.update(batch, delta);
        batch.end();

    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height);
    }


    @Override
    public void dispose() {
        batch.dispose();
    }
}
