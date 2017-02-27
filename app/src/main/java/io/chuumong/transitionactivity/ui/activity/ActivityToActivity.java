package io.chuumong.transitionactivity.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import io.chuumong.transitionactivity.MainActivity;
import io.chuumong.transitionactivity.R;

public class ActivityToActivity extends AppCompatActivity implements View.OnClickListener {

    public static void start(Context context) {
        Intent intent = new Intent(context, ActivityToActivity.class);
        context.startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_activity);

        findViewById(R.id.btn_transition).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_transition:
                setTransitionAnimation();
                break;
        }
    }

    private void setTransitionAnimation() {
        Intent intent = new Intent(this, SharedActivity.class);
        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(this,
                findViewById(R.id.image_marshmallow),
                getString(R.string.marshmallow_transition));

        startActivity(intent, optionsCompat.toBundle());
    }
}
