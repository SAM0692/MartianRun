package com.gamastudio24.martianrun.actors;

import com.badlogic.gdx.physics.box2d.Body;
import com.gamastudio24.martianrun.box2d.GroundUserData;

public class Ground extends GameActor {
	
	Body body;
	
	public Ground(Body body) {
		super(body);
	}
	
	@Override
	public GroundUserData getUserData() {
		return (GroundUserData) userData;
	}
}