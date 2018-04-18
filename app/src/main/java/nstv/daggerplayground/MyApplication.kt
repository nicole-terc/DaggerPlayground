package nstv.daggerplayground

import android.app.Application
import nstv.daggerplayground.app.AppComponent
import nstv.daggerplayground.app.AppModule
import nstv.daggerplayground.app.DaggerAppComponent
import nstv.daggerplayground.cache.CacheModule
import nstv.daggerplayground.cache.CacheSubcomponent
import nstv.daggerplayground.network.NetworkModule
import nstv.daggerplayground.network.NetworkSubcomponent

/**
 * Created by Nicole Terc on 4/16/18.
 */
class MyApplication : Application() {
    private lateinit var appComponent: AppComponent
    private var networkSubcomponent: NetworkSubcomponent? = null
    private var cacheSubcomponent: CacheSubcomponent? = null

    companion object {
        lateinit var instance: MyApplication
        fun get() = instance
    }

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
        instance = this

    }

    fun appComponent():AppComponent = appComponent

    fun plusNetworkSubcomponent(): NetworkSubcomponent {
        if (networkSubcomponent == null) {
            networkSubcomponent = appComponent().plusNetworkSubcomponent(NetworkModule())
        }
        return networkSubcomponent!!
    }

    fun plusCacheSubcomponent(): CacheSubcomponent {
        if (cacheSubcomponent == null) {
            cacheSubcomponent = plusNetworkSubcomponent().plusCacheSubcomponent(CacheModule())
        }
        return cacheSubcomponent!!
    }
}