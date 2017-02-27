package io.chuumong.transitionactivity.ui.fragment;

import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import io.chuumong.transitionactivity.R;

/**
 * Created by JongHunLee on 2017-02-27.
 */

public class SimpleFragment extends Fragment implements View.OnClickListener {

    public static SimpleFragment newInstance() {
        return new SimpleFragment();
    }

    private final static String TAG = SimpleFragment.class.getSimpleName();

    private ImageView imageView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_simple, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        imageView = (ImageView) view.findViewById(R.id.image_nougat);
        view.findViewById(R.id.btn_transition).setOnClickListener(this);
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
        getFragmentManager().beginTransaction()
                .addSharedElement(imageView, getString(R.string.nougat_transition))
                .addToBackStack(TAG)
                .replace(R.id.frame_content, SharedFragment.newInstance())
                .commit();
    }
}
