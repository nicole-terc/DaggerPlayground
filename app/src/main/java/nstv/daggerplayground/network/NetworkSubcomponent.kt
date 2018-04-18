package nstv.daggerplayground.network

import dagger.Subcomponent
import nstv.daggerplayground.cache.CacheModule
import nstv.daggerplayground.cache.CacheSubcomponent

/**
 * Created by Nicole Terc on 4/16/18.
 */

@NetworkScope
@Subcomponent(modules = [(NetworkModule::class)])
interface NetworkSubcomponent{
    fun plusCacheSubcomponent(cacheModule: CacheModule): CacheSubcomponent
}