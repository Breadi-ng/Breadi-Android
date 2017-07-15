package co.codehaven.breadi.main;

import co.codehaven.breadi.di.ActivityScope;
import co.codehaven.breadi.di.ApplicationComponent;

import dagger.Component;

@ActivityScope
@Component(modules = {MainModule.class}, dependencies = {ApplicationComponent.class})
public interface MainComponent {
    void inject(MainActivity activity);
}
