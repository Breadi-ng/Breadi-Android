package co.codehaven.breadi.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import co.codehaven.breadi.R;

public abstract class BaseActivity extends AppCompatActivity implements IBaseView {

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }
}