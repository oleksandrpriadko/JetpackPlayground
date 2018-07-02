package com.android.oleksandrpriadko.jetpackplayground.australia.nsw;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.android.oleksandrpriadko.jetpackplayground.App;
import com.android.oleksandrpriadko.jetpackplayground.R;

import androidx.navigation.Navigation;
import butterknife.BindView;
import butterknife.ButterKnife;

public class NSWActivity extends AppCompatActivity {

    @BindView(R.id.textView_app_message) TextView mTextViewAppMessage;
    @BindView(R.id.input_activity_message) TextView mInputActivityMessage;

    private NSWShareViewModel mNSWShareViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nsw);

        mNSWShareViewModel = ViewModelProviders
            .of(this)
            .get(NSWShareViewModel.class);

        ButterKnife.bind(this);

        App.getAppViewModel()
            .getStringLiveData()
            .observe(this, s -> mTextViewAppMessage.setText(s));

        mInputActivityMessage.setOnEditorActionListener((v, actionId, event) -> {
            mNSWShareViewModel.getStringMutableLiveData().postValue(v.getText().toString());
            return false;
        });
    }

    @Override
    public void onBackPressed() {
        if (!Navigation.findNavController(this, R.id.nav_host).popBackStack()) {
            super.onBackPressed();
        }
    }
}
