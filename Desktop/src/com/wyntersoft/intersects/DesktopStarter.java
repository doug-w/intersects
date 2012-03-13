package com.wyntersoft.intersects;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

/**
 * User: dwarren
 * Date: 3/10/12
 */
public class DesktopStarter {
    public static void main (String[] args) {
        new LwjglApplication(new IntersectsLauncher(), "IntersectsLauncher", 480, 320, false);
    }
}