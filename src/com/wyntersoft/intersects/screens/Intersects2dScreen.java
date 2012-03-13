package com.wyntersoft.intersects.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.wyntersoft.intersects.com.wnytersoft.intersects.views.Renderer2d;
import com.wyntersoft.intersects.models.WorldRep2d;

/**
 * Created by IntelliJ IDEA.
 * User: dwarren
 * Date: 3/11/12
 * Time: 10:36 AM
 * To change this template use File | Settings | File Templates.
 */
public class Intersects2dScreen implements Screen {

    private WorldRep2d world2d;
    private Renderer2d renderer2d;

    public void render(float v) {
        Gdx.gl.glClearColor(.1f, .1f, .1f, 1);
        Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);

        renderer2d.render();
    }

    public void resize(int i, int i1) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void show() {
        world2d = new WorldRep2d();
        renderer2d = new Renderer2d(world2d);
    }

    public void hide() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void pause() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void resume() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void dispose() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
