package com.digitalmango.spacekillers.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;
import com.digitalmango.spacekillers.MainGame;

/**
 * Created by Carlos Zamora on 31/03/2017.
 */

public class Bullet {

    private Sprite sprite;
    private MainGame mainGame;
    private Rectangle hitBox;

    private int speed = 50;
    public boolean isAlive = true;

    public Bullet (MainGame mainGame, float x, float y){

        this.mainGame = mainGame;

        sprite = new Sprite();
        sprite.setSize(2, 4);
        sprite.setPosition(x, y);
        sprite.setRegion(mainGame.getTextureAtlas().findRegion("player_bullet"));

        hitBox = new Rectangle();
        hitBox.setSize(sprite.getWidth(), sprite.getHeight());
    }

    public void update(Batch batch, float delta){
        sprite.translateY(speed * delta);
        hitBox.setPosition(sprite.getX(), sprite.getY());

        sprite.draw(batch);

        if(sprite.getY() > MainGame.SCREEN_HEIGHT){
            isAlive = false;
        }
    }

    public void hitEffect(){
        Gdx.app.log("Bala hit", "");
        isAlive = false;
    }

}
