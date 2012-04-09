package com.wyntersoft.intersects.models;


import com.badlogic.gdx.utils.Array;

/**
 * Created by IntelliJ IDEA.
 * User: dwarren
 * Date: 3/11/12
 * Time: 3:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class WorldRep2d {
    public Array<Rectangle2d> rectangle2dList = new Array<Rectangle2d>();
    public Array<LineSegment2d> linesegment2dList = new Array<LineSegment2d>();

    public Array<LineSegment2d> getLineSegmentss() {
        return linesegment2dList;
    }

    public Array<Rectangle2d> getRectangles() {
        return rectangle2dList;
    }

    public WorldRep2d() {
        rectangle2dList.add(new Rectangle2d(new Point2d(240, 160), 20, 20    ));
        linesegment2dList.add(new LineSegment2d(new Point2d(140, 140), new Point2d(180, 180)));
    }
}
