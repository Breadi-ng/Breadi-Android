package co.codehaven.breadi;

import com.crashlytics.android.Crashlytics;
import com.crashlytics.android.core.CrashlyticsCore;
import co.codehaven.breadi.di.ApplicationComponent;
import co.codehaven.breadi.di.ApplicationModule;
import co.codehaven.breadi.di.DaggerApplicationComponent;
import co.codehaven.breadi.utils.timber.CrashReportTree;

import io.fabric.sdk.android.Fabric;
import timber.log.Timber;

public class Application extends android.app.Application{

	private static ApplicationComponent component;

    public static ApplicationComponent getComponent() {
        return component;
    }

    @Override
    public  void onCreate(){
        super.onCreate();

        //di
        component = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();

         //Crashlytics
        CrashlyticsCore core = new CrashlyticsCore.Builder()
                .disabled(BuildConfig.DEBUG)
                .build();

        Fabric.with(this, new Crashlytics.Builder().core(core).build());

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        } else {
            Timber.plant(new CrashReportTree());
        }
    }

}