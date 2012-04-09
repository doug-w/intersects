package com.wyntersoft.intersects.views;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.wyntersoft.intersects.models.LineSegment2d;
import com.wyntersoft.intersects.models.Rectangle2d;
import com.wyntersoft.intersects.models.WorldRep2d;

/**
 * Created by IntelliJ IDEA.
 * User: dwarren
 * Date: 3/11/12
 * Time: 3:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class Renderer2d {

    private static final int WIDTH = 480;
	private static final int HEIGHT = 320;

    private WorldRep2d world;
    private OrthographicCamera camera;
    private ShapeRenderer renderer;

    public Renderer2d(WorldRep2d world) {
		this.world = world;
		this.camera = new OrthographicCamera(WIDTH, HEIGHT);
		this.camera.position.set(WIDTH / 2f, HEIGHT / 2f, 0);
		this.camera.update();

        this.renderer = new ShapeRenderer();
	}

    public void render() {
        camera.update();

        renderer.setProjectionMatrix(camera.combined);

        // Draw rectangles
        renderer.begin(ShapeRenderer.ShapeType.FilledRectangle);
        renderer.setColor(new Color(1, 0, 0, 1));
        for(Rectangle2d rectangle : world.getRectangles() ) {
            renderer.filledRect(rectangle.getCenter().getX(), rectangle.getCenter().getY(),
                    rectangle.width, rectangle.height);
        }
        renderer.end();

        // Draw lines
        renderer.begin(ShapeRenderer.ShapeType.Line);
        renderer.setColor(new Color(0, 0, 1, 1));
        for(LineSegment2d line : world.getLineSegmentss()) {
            renderer.line(line.getStartingPoint().getX(), line.getStartingPoint().getY(),
                    line.getEndingPoint().getX(), line.getEndingPoint().getY());
        }


        renderer.end();
    }
}
