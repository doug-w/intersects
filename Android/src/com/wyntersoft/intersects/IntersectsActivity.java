package com.wyntersoft.intersects;

import android.os.Bundle;
import com.badlogic.gdx.backends.android.AndroidApplication;

public class IntersectsActivity extends AndroidApplication
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        initialize(new IntersectsLauncher(), false);
    }
}
