package com.android.oleksandrpriadko.jetpackplayground;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.navigation.Navigation;
import butterknife.BindView;
import butterknife.ButterKnife;

public final class AustraliaFragment extends Fragment {

    @BindView(R.id.button_to_nsw) Button mButtonToNSW;
    @BindView(R.id.button_to_vic) Button mButtonToVic;

    private AustraliaViewModel mViewModel;

    public static AustraliaFragment newInstance() {
        return new AustraliaFragment();
    }

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

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mViewModel = ViewModelProviders.of(this).get(AustraliaViewModel.class);
    }

}
