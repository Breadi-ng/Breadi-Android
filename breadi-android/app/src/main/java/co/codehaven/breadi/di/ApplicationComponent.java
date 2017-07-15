package co.codehaven.breadi.di;

import android.content.Context;
import android.content.SharedPreferences;

import co.codehaven.breadi.Application;

import javax.inject.Singleton;

import dagger.Component;

@Singleton




@Component(modules = {ApplicationModule.class,NetModule.class})

public interface ApplicationComponent {
    Application app();

    Context context();

    SharedPreferences preferences();
}