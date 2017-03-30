package com.digitalmango.spacekillers;

import com.badlogic.gdx.Game;
import com.digitalmango.spacekillers.screens.GamePlay;

public class MainGame extends Game {

	GamePlay gamePlay;

	@Override
	public void create() {
		gamePlay = new GamePlay(this, this);
		setScreen(gamePlay);
	}



}
