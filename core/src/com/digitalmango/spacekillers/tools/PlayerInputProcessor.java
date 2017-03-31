package com.digitalmango.spacekillers.tools;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.digitalmango.spacekillers.entities.Player;

/**
 * Created by Carlos Zamora on 31/03/2017.
 */

public class PlayerInputProcessor implements InputProcessor {

    private Player player;

    public PlayerInputProcessor (Player player) {
        this.player = player;

    }


    @Override
    public boolean keyDown(int keycode) {
        if(keycode == Input.Keys.A){
            player.setDirection(-1);
            player.speed = player.speedValue;
        }

        if(keycode == Input.Keys.S){
            player.setDirection(1);
            player.speed = player.speedValue;
        }

        if(keycode == Input.Keys.SPACE){
            player.shoot();

        }
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {

        if(keycode == Input.Keys.A){
            player.setDirection(0);
            player.speed = 0;
        }

        if(keycode == Input.Keys.S){
            player.setDirection(0);
            player.speed = 0;
        }
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
