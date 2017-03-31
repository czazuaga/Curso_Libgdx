package com.digitalmango.spacekillers.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;
import com.digitalmango.spacekillers.MainGame;

/**
 * Created by Carlos Zamora on 30/03/2017.
 */

public class Player {

    private int direction = 0;
    public int speedValue = 50;
    public int speed = 0;

    private MainGame mainGame;
    private float x;
    private float y;

    public Sprite sprite;

    private TextureRegion currentRegion;
    private float timer = 0;
    private Animation animation;

    public Player (MainGame mainGame, float x, float y) {

        this.mainGame = mainGame;
        this.x = x;
        this.y = y;

        sprite = new Sprite();
        sprite.setBounds(x, y, 16, 16);

        Array<TextureRegion> frames = new Array<TextureRegion>();

        for(int i = 1; i < 3; i++ ){
            frames.add(mainGame.getTextureAtlas().findRegion("player" + i));
        }

        animation = new Animation(0.08f, frames);
        currentRegion = mainGame.getTextureAtlas().findRegion("player1");
        frames.clear();

    }

    public void update (Batch batch, float delta){
        //animation management
        timer += delta;
        currentRegion = (TextureRegion) animation.getKeyFrame(timer, true);
        sprite.setRegion(currentRegion);

        move(delta);

        sprite.draw(batch);
    }

    private void move (float delta) {

        if(sprite.getX() >= 0 && sprite.getX() <= (MainGame.SCREEN_WIDTH - sprite.getWidth())){
            sprite.translateX( (speed * direction) * delta);
        }

        if(sprite.getX() < 0){
            sprite.setX(0);
        }

        if(sprite.getX() > (MainGame.SCREEN_WIDTH - sprite.getWidth())){
            sprite.setX(MainGame.SCREEN_WIDTH - sprite.getWidth());
        }

    }

    public void setDirection (int direction){
        this.direction = direction;
    }

    public void shoot(){
        Gdx.app.log("DISPARASTE","");
        mainGame.gamePlay.entitiesManager.createBullet(sprite.getX() + ((sprite.getWidth() / 2) - 1), sprite.getY() + sprite.getHeight());

    }


}
