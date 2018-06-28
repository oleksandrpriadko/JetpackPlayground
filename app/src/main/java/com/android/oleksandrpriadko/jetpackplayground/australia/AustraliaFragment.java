package com.android.oleksandrpriadko.jetpackplayground.australia;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.android.oleksandrpriadko.jetpackplayground.R;

import androidx.navigation.Navigation;
import butterknife.BindView;
import butterknife.ButterKnife;

public final class AustraliaFragment extends Fragment {

    @BindView(R.id.button_to_nsw) Button mButtonToNSW;
    @BindView(R.id.button_to_vic) Button mButtonToVic;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_australia, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);

        mButtonToNSW.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_australiaFragment_to_NSWActivity));

        mButtonToVic.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_australiaFragment_to_vicActivity));
    }
}
