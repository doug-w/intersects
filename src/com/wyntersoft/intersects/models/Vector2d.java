package com.wyntersoft.intersects.models;

/**
 * Created by IntelliJ IDEA.
 * User: dwarren
 * Date: 3/18/12
 * Time: 4:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class Vector2d {
    public float x;
    public float y;

    public Vector2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float magnitude() {
        return (float) Math.sqrt(x*x + y*y);
    }

    // Normalise into a Unit Vector
    public Vector2d normalise() {
        float magnitude = this.magnitude();
        return new Vector2d(x / magnitude, y / magnitude);
    }
}
