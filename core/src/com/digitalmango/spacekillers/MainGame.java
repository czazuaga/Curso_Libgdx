package com.digitalmango.spacekillers;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.digitalmango.spacekillers.screens.GamePlay;
import com.digitalmango.spacekillers.tools.AssetLoader;

public class MainGame extends Game {

	public static final int SCREEN_WIDTH = 120;
	public static final int SCREEN_HEIGHT = 200;

	public AssetLoader assetLoader;
	private TextureAtlas textureAtlas;

	public GamePlay gamePlay;

	@Override
	public void create() {

		//Resource load
		assetLoader = new AssetLoader();
		textureAtlas = assetLoader.getAssetManager().get("atlas/atlas.pack", TextureAtlas.class);

		//screens
		gamePlay = new GamePlay(this, this);
		setScreen(gamePlay);
	}

	@Override
	public void dispose (){
		assetLoader.getAssetManager().dispose();
	}

	public TextureAtlas getTextureAtlas () {
		return textureAtlas;
	}

}
