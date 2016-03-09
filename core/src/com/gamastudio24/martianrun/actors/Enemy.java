package com.gamastudio24.martianrun.actors;

import com.badlogic.gdx.physics.box2d.Body;
import com.gamastudio24.martianrun.box2d.EnemyUserData;
import com.gamastudio24.martianrun.box2d.UserData;

/**
 * Created by SAM on 29/02/2016.
 */
public class Enemy extends GameActor {

    public Enemy(Body body){
      super(body);
    }

    @Override
    public EnemyUserData getUserData() {
        return (EnemyUserData) userData;
    }

    @Override
    public void act(float delta) {
        super.act(delta);
        body.setLinearVelocity(getUserData().getLinearVelocity());
    }
}
