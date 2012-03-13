package com.wyntersoft.intersects;

import com.badlogic.gdx.Game;
import com.wyntersoft.intersects.screens.Intersects2dScreen;

/**
 * User: dwarren
 * Date: 3/10/12
 */
public class IntersectsLauncher extends Game {

    public void create() {
        setScreen(new Intersects2dScreen());
    }
}