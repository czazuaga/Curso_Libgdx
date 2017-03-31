package com.digitalmango.spacekillers.tools;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

/**
 * Created by Carlos Zamora on 30/03/2017.
 */

public class AssetLoader {

    private AssetManager assetManager;

    public AssetLoader () {
        assetManager = new AssetManager();

        //Music
        assetManager.load("audio/theme_music.ogg", Music.class);

        //Sounds
        assetManager.load("audio/item_sound.ogg", Sound.class);
        assetManager.load("audio/laser_sound.ogg", Sound.class);
        assetManager.load("audio/player_explosion_sound.ogg", Sound.class);
        assetManager.load("audio/enemy_explosion_sound.ogg", Sound.class);

        //Atlas
        assetManager.load("atlas/atlas.pack", TextureAtlas.class);

        assetManager.finishLoading();

    }

    public AssetManager getAssetManager () {
        return this.assetManager;
    }



}
