package com.android.oleksandrpriadko.jetpackplayground.australia.nsw.cities;

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
import com.android.oleksandrpriadko.jetpackplayground.australia.nsw.NSWShareViewModel;

import androidx.navigation.Navigation;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class NewcastleFragment extends Fragment {

//    @BindView(R.id.textView_activity_message) TextView mTextViewActivityMessage;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_newcastle, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ButterKnife.bind(this, view);
    }

    @OnClick(R.id.button_to_sydney)
    protected void toSydney() {
        Navigation
            .findNavController(getActivity(), R.id.nav_host)
            .navigate(R.id.action_newcastleFragment_to_sydneyFragment);
    }

    @OnClick(R.id.button_to_nsw)
    protected void toNSW() {
        Navigation
            .findNavController(getActivity(), R.id.nav_host)
            .navigate(R.id.action_newcastleFragment_pop);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        ViewModelProviders
//            .of(getActivity())
//            .get(NSWShareViewModel.class)
//            .getStringMutableLiveData()
//            .observe(this, s -> mTextViewActivityMessage.setText(s));
    }
}
