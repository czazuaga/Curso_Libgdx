package com.digitalmango.spacekillers.tools;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.digitalmango.spacekillers.MainGame;

/**
 * Created by Carlos Zamora on 30/03/2017.
 */

public abstract class BaseScreen implements Screen {

    private Game maingame;

    public SpriteBatch batch;
    public OrthographicCamera camera;
    public Viewport viewport;

    public BaseScreen (Game maingame){

        this.maingame = maingame;

        camera = new OrthographicCamera(MainGame.SCREEN_WIDTH, MainGame.SCREEN_HEIGHT);
        camera.setToOrtho(false, MainGame.SCREEN_WIDTH, MainGame.SCREEN_HEIGHT);
        viewport = new StretchViewport(MainGame.SCREEN_WIDTH, MainGame.SCREEN_HEIGHT, camera);
        viewport.apply();

        batch = new SpriteBatch();
    }

    @Override
    public void dispose() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void show() {

    }
}
