package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

public class BodyPartFragment extends Fragment {

    public BodyPartFragment() {}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // Inflating root view by fragment
        View rootView = inflater.inflate(R.layout.fragment_body_part, container, false);

        // Find the head image view
        ImageView headImageView = (ImageView) rootView.findViewById(R.id.head_image_view);

        // Set image for head image view
        headImageView.setImageResource(AndroidImageAssets.getHeads().get(0));

        return rootView;

    }
}
