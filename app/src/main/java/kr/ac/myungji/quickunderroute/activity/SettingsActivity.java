package kr.ac.myungji.quickunderroute.activity;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

import kr.ac.myungji.quickunderroute.R;

public class SettingsActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_settings);
    }
}
