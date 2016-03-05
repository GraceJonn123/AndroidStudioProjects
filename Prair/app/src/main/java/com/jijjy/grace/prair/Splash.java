package com.jijjy.grace.prair;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        final ImageView iv = (ImageView) findViewById((R.id.imageView));
        final Animation an = AnimationUtils.loadAnimation((getBaseContext(),R.anim.rotate));
        final Animation an2 = AnimationUtils.loadAnimation((getBaseContext(),R.anim.fade_out));


        iv.startAnimation(an);
        an.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        }Listener()) {
            @Override
            public void onAnimationStart(Animation animation){

            }

            @Override
            public void onAnimationEnd(Animation animation){

                iv.startAnimation(an2);
                finish();
                Intent i = new Intent(this, Main.class);
                startActivity(i);

            }

            @Override
            public void onAnimationRepeat(Animation animation){

            }

        }
    }
}
