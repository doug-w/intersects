package com.wyntersoft.intersects.models;

/**
 * Created by IntelliJ IDEA.
 * User: dwarren
 * Date: 4/3/12
 * Time: 7:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class LineSegment2d {
    private Point2d startingPoint;
    private Point2d endingPoint;

    private Vector2d vector;

    LineSegment2d(Point2d startingPoint, Point2d endingPoint) {
        this.setStartingPoint(startingPoint);
        this.setEndingPoint(endingPoint);

        setVector(new Vector2d(startingPoint.x - endingPoint.x, startingPoint.y - endingPoint.y));
    }

    public Point2d getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(Point2d startingPoint) {
        this.startingPoint = startingPoint;
    }

    public Point2d getEndingPoint() {
        return endingPoint;
    }

    public void setEndingPoint(Point2d endingPoint) {
        this.endingPoint = endingPoint;
    }

    public Vector2d getVector() {
        return vector;
    }

    public void setVector(Vector2d vector) {
        this.vector = vector;
    }
}
