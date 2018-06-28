package com.android.oleksandrpriadko.jetpackplayground.australia;

import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.widget.TextView;

import com.android.oleksandrpriadko.jetpackplayground.App;
import com.android.oleksandrpriadko.jetpackplayground.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AustraliaActivity extends AppCompatActivity {

    @BindView(R.id.textView_app_message) TextView mTextViewAppMessage;
    @BindView(R.id.input_app_message) TextInputEditText mInputAppMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_australia);

        ButterKnife.bind(this);

        App.getAppViewModel()
            .getStringLiveData()
            .observe(this, s -> mTextViewAppMessage.setText(s));

        mInputAppMessage.setOnEditorActionListener((v, actionId, event) -> {
            App
                .getAppViewModel()
                .getStringLiveData()
                .postValue(v.getText().toString());
            return false;
        });
    }
}
