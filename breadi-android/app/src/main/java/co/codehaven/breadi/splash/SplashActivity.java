package co.codehaven.breadi.splash;

import co.codehaven.breadi.main.MainActivity;
import co.codehaven.breadi.base.BaseActivity;
import android.content.Intent;
import android.os.Bundle;

import co.codehaven.breadi.R;

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }
}