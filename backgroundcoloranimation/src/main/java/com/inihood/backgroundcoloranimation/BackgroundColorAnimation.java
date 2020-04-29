package com.inihood.backgroundcoloranimation;

import android.graphics.drawable.AnimationDrawable;
import android.view.View;
import android.widget.RelativeLayout;

public class BackgroundColorAnimation {

    AnimationDrawable mAnimationDrawable;
    private int duration;

    public BackgroundColorAnimation init(View v){
        mAnimationDrawable = (AnimationDrawable) v.getBackground();
        return this;
    }

    public BackgroundColorAnimation setEnterAnimDuration(int duration){
        this.duration = duration;
        mAnimationDrawable.setEnterFadeDuration(duration);
        return this;
    }

    public BackgroundColorAnimation setExitAnimDuration(int duration){
        this.duration = duration;
        mAnimationDrawable.setExitFadeDuration(duration);
        return this;
    }

    public BackgroundColorAnimation start(){
        if(mAnimationDrawable != null && !mAnimationDrawable.isRunning()){
            mAnimationDrawable.start();
        }
        return this;
    }

    public BackgroundColorAnimation stop(){
        if(mAnimationDrawable != null && mAnimationDrawable.isRunning()){
            mAnimationDrawable.stop();
        }
        return this;
    }
}
