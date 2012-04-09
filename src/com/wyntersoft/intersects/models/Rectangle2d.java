package com.wyntersoft.intersects.models;

/**
 * Created by IntelliJ IDEA.
 * User: dwarren
 * Date: 3/11/12
 * Time: 7:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class Rectangle2d {
    private Point2d center;
    public float height;
    public float width;

    public Rectangle2d(Point2d center, float height, float width) {
        this.setCenter(center);
        this.height = height;
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }


    public Point2d getCenter() {
        return center;
    }

    public void setCenter(Point2d center) {
        this.center = center;
    }
}
