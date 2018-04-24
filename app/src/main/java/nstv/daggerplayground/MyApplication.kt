package nstv.daggerplayground

import android.app.Application
import net.hockeyapp.android.metrics.MetricsManager
import nstv.baselibrary.AppComponent
import nstv.baselibrary.AppModule
import nstv.baselibrary.DaggerAppComponent
import nstv.networkmodule.DaggerNetworkSubcomponent
import nstv.networkmodule.NetworkSubcomponent

/**
 * Created by Nicole Terc on 4/16/18.
 */
class MyApplication : Application() {
    private lateinit var appComponent: AppComponent
    private var networkSubcomponent: NetworkSubcomponent? = null

    companion object {
        lateinit var instance: MyApplication
        fun get() = instance
    }

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
        instance = this
        MetricsManager.register(this)
    }

    fun appComponent():AppComponent = appComponent

    fun networkComponent(): NetworkSubcomponent {
        if (networkSubcomponent == null) {
            networkSubcomponent = DaggerNetworkSubcomponent.builder().appComponent(appComponent).build()
        }
        return networkSubcomponent!!
    }
}