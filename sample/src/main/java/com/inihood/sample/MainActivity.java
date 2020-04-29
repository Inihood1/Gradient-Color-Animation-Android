package com.inihood.sample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.RelativeLayout;

import com.inihood.backgroundcoloranimation.BackgroundColorAnimation;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.ff);

        new BackgroundColorAnimation().
                init(layout).
                setEnterAnimDuration(500).
                setExitAnimDuration(200).
                start();

    }

    @Override
    protected void onPause() {
        super.onPause();
        new BackgroundColorAnimation().stop();
    }

    @Override
    protected void onResume() {
        super.onResume();
        new BackgroundColorAnimation().start();
    }
}
