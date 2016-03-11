package com.gamastudio24.martianrun.actors;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.gamastudio24.martianrun.box2d.UserData;
import com.gamastudio24.martianrun.utils.Constants;

public abstract class GameActor extends Actor {
	
	protected Body body;
	protected UserData userData;
	protected Rectangle screenRectangle;
	
	public GameActor(Body body) {
		this.body = body;
		this.userData = (UserData) body.getUserData();
		screenRectangle = new Rectangle();
	}

	@Override
	public void act(float delta) {
		super.act(delta);

		if(body.getUserData() != null) {
			updateRectangle();
		} else {
			remove();
		}
	}
	
	public abstract UserData getUserData();

	private void updateRectangle() {
		screenRectangle.x = transformToScreen(body.getPosition().x - userData.getWidth());
		screenRectangle.y = transformToScreen(body.getPosition().y - userData.getHeight());
		screenRectangle.width = transformToScreen(userData.getWidth());
		screenRectangle.height = transformToScreen(userData.getHeight());
	}

	protected float transformToScreen(float n) {
		return Constants.WORLD_TO_SCREEN * n;
	}
}
