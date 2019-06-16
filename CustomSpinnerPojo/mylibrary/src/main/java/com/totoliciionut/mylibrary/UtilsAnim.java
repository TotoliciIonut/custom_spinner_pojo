package com.totoliciionut.mylibrary;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.climberr.climberr.R;

public class UtilsAnim {

    public static void slideDownView(final View view, final Context context,
                                     final Runnable onAnimationStartRunnable,
                                     final Runnable onAnimationEndRunnable) {

        Animation slide_down = AnimationUtils.loadAnimation(context.getApplicationContext(),
                R.anim.slide_down);

        slide_down.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                if (onAnimationStartRunnable != null) onAnimationStartRunnable.run();
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                if (onAnimationEndRunnable != null) onAnimationEndRunnable.run();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });


        view.startAnimation(slide_down);

    }

    public static void slideUpView(final View view, final Context context,
                                   final Runnable onAnimationStartRunnable,
                                   final Runnable onAnimationEndRunnable) {


        Animation slide_down = AnimationUtils.loadAnimation(context.getApplicationContext(),
                R.anim.slide_up);

        slide_down.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                if (onAnimationStartRunnable != null) onAnimationStartRunnable.run();
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                if (onAnimationEndRunnable != null) onAnimationEndRunnable.run();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });


        view.startAnimation(slide_down);
    }

    public static void slideDownViewFrom0(View view,
                                          Context context,
                                          final Runnable runnableOnStart,
                                          final Runnable runnableOnEnd) {

        Animation slide_down = AnimationUtils.loadAnimation(context.getApplicationContext(),
                R.anim.slide_down_from_0);

        slide_down.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                if (runnableOnStart != null) runnableOnStart.run();
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                if (runnableOnEnd != null) runnableOnEnd.run();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });


        view.startAnimation(slide_down);

    }
    public static ValueAnimator getMoveViewDownAnimation(final View view,
                                                         int duration,
                                                         final int amountToMoveDown){

        ValueAnimator animator = ValueAnimator.ofFloat(view.getY(), view.getX()+amountToMoveDown);
        animator.setInterpolator(new AccelerateDecelerateInterpolator());
        animator.setDuration(duration);

        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedValue = (float) valueAnimator.getAnimatedValue();
                view.setY(animatedValue);
                view.invalidate();
            }
        });

        return animator;

    }

    public static ValueAnimator getMakeTextSizeBiggerAnimation(final TextView textView ,
                                                               int duration,
                                                               final int startSize,
                                                               final int endSize){

        ValueAnimator animator = ValueAnimator.ofFloat(startSize, endSize);
        animator.setInterpolator(new AccelerateDecelerateInterpolator());
        animator.setDuration(duration);

        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedValue = (float) valueAnimator.getAnimatedValue();
                textView.setTextSize(animatedValue);
            }
        });

        return animator;
    }


    public static void moveViewDownWithAnimationAndMakeTextSmaller(final TextView view,
                                                                   final int duration,
                                                                   int amountToMoveDown,
                                                                   final int startTextSize,
                                                                   final int endTextSize,
                                                                   final Runnable onAnimationEndRunnable){
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether
                (getMoveViewDownAnimation
                                (view,duration,amountToMoveDown),
                        getMakeTextSizeBiggerAnimation
                                (view,duration,startTextSize,endTextSize));
        animatorSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                onAnimationEndRunnable.run();
            }
        });
        animatorSet.setDuration(duration);
        animatorSet.start();

        view.invalidate();




    }
}