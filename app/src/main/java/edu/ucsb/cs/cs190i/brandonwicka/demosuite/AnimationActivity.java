package edu.ucsb.cs.cs190i.brandonwicka.demosuite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        AnimationFragment fragment = new AnimationFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.animation_frame, fragment).commit();
    }
}