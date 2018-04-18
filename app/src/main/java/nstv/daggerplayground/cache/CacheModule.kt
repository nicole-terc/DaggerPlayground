package nstv.daggerplayground.cache

import android.app.Application
import dagger.Module
import dagger.Provides
import nstv.daggerplayground.network.Network

/**
 * Created by Nicole Terc on 4/16/18.
 */
@Module
@CacheScope
class CacheModule {

    @Provides
    fun providesCache(app:Application, network:Network):Cache{
        return Cache(app, network)
    }
}