package io.chuumong.transitionactivity.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.chuumong.transitionactivity.MainActivity;
import io.chuumong.transitionactivity.R;
import io.chuumong.transitionactivity.ui.fragment.SimpleFragment;

public class FragmentToActivity extends AppCompatActivity {

    public static void start(Context context) {
        Intent intent = new Intent(context, FragmentToActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_to);

        getSupportFragmentManager().beginTransaction().add(R.id.frame_content, SimpleFragment.newInstance()).commit();
    }
}
