package com.wyntersoft.intersects.models;

/**
 * Created by IntelliJ IDEA.
 * User: dwarren
 * Date: 4/3/12
 * Time: 7:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class Point2d {
    public float x;
    public float y;

    public Point2d(float x, float y) {
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
}
