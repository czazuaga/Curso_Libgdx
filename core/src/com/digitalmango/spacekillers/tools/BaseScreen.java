package com.digitalmango.spacekillers.tools;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;

/**
 * Created by Carlos Zamora on 30/03/2017.
 */

public abstract class BaseScreen implements Screen {

    private Game maingame;

    public BaseScreen (Game maingame){

        this.maingame = maingame;
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
