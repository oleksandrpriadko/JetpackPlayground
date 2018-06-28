package com.android.oleksandrpriadko.jetpackplayground.vic;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.oleksandrpriadko.jetpackplayground.R;

import androidx.navigation.Navigation;

public class VicFragment extends Fragment {

    private VicViewModel mViewModel;

    public static VicFragment newInstance() {
        return new VicFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_vic, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_to_melbourne).setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_vicFragment_to_melbourneFragment));

        view.findViewById(R.id.button_to_ballarat).setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_vicFragment_to_ballaratFragment));
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(VicViewModel.class);
    }

}
