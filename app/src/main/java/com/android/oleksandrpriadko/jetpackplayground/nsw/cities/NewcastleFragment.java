package com.android.oleksandrpriadko.jetpackplayground.nsw.cities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.oleksandrpriadko.jetpackplayground.R;

import androidx.navigation.Navigation;

public class NewcastleFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_newcastle, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_to_sydney).setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_newcastleFragment_to_sydneyFragment));

        view.findViewById(R.id.button_to_nsw).setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_newcastleFragment_pop));
    }
}
