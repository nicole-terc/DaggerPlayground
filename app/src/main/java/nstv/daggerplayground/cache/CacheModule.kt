package nstv.daggerplayground.cache

import android.app.Application
import dagger.Module
import dagger.Provides

/**
 * Created by Nicole Terc on 4/16/18.
 */
@Module
@CacheScope
class CacheModule {

    @Provides
    fun providesCache(app:Application):Cache{
        return Cache(app)
    }
}