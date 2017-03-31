package com.digitalmango.spacekillers.entities;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.digitalmango.spacekillers.MainGame;

import java.util.ArrayList;

/**
 * Created by Carlos Zamora on 31/03/2017.
 */

public class EntitiesManager {

    public ArrayList<Bullet> bulletsBuffer = new ArrayList<Bullet>();
    public ArrayList<Bullet> bulletsDeadBuffer = new ArrayList<Bullet>();
    private MainGame mainGame;

    public EntitiesManager (MainGame mainGame) {

        this.mainGame = mainGame;
    }

    public void update (Batch batch, float delta){

        //Update and remove bullets system
        for (Bullet bullet  : bulletsBuffer){
            bullet.update(batch, delta);
            if(!bullet.isAlive){
                bulletsDeadBuffer.add(bullet);
            }
        }

        while(bulletsDeadBuffer.size() != 0){
            bulletsBuffer.remove(bulletsDeadBuffer.get(0));
            bulletsDeadBuffer.remove(0);
        }
        //----------------------------------------

    }

    public void createBullet (float x, float y){
        bulletsBuffer.add(new Bullet(mainGame, x, y));
    }

}
