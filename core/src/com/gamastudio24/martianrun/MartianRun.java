package com.gamastudio24.martianrun;


import com.badlogic.gdx.Game;
import com.gamastudio24.martianrun.screens.GameScreen;

public class MartianRun extends Game {

	@Override
	public void create() {
		setScreen(new GameScreen());
	}

}
