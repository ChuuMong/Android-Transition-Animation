package io.chuumong.transitionactivity;

import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
