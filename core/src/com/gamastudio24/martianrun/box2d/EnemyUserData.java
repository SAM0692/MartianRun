package com.gamastudio24.martianrun.box2d;

import com.badlogic.gdx.math.Vector2;
import com.gamastudio24.martianrun.enums.UserDataType;
import com.gamastudio24.martianrun.utils.Constants;

/**
 * Created by SAM on 29/02/2016.
 */
public class EnemyUserData extends UserData {

    private Vector2 linearVelocity;

    public EnemyUserData(float width, float height) {
        super(width, height);
        userDataType = UserDataType.ENEMY;
        linearVelocity = Constants.ENEMY_LINEAR_VELOCITY;
    }

    public Vector2 getLinearVelocity() {
        return linearVelocity;
    }

    public void setLinearVelocity(Vector2 linearVelocity) {
        this.linearVelocity = linearVelocity;
    }
}
