package com.android.oleksandrpriadko.jetpackplayground.australia.vic.cities;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.oleksandrpriadko.jetpackplayground.R;
import com.android.oleksandrpriadko.jetpackplayground.australia.vic.VICShareViewModel;

import androidx.navigation.Navigation;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class BallaratFragment extends Fragment {

    @BindView(R.id.textView_activity_message) TextView mTextViewActivityMessage;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_ballarat, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ButterKnife.bind(this, view);

        ViewModelProviders.of(getActivity()).get(VICShareViewModel.class).getStringMutableLiveData().observe(
            this, s -> mTextViewActivityMessage.setText(s));
    }

    @OnClick(R.id.button_to_melbourne)
    protected void toMelbourne() {
        Navigation.findNavController(getActivity(), R.id.nav_host)
            .navigate(R.id.action_ballaratFragment_to_melbourneFragment);
    }

    @OnClick(R.id.button_to_vic)
    protected void toVIC() {
        Navigation.findNavController(getActivity(), R.id.nav_host)
            .navigate(R.id.action_ballaratFragment_pop);
    }
}
