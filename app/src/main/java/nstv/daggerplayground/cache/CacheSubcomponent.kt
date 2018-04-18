package nstv.daggerplayground.cache

import dagger.Subcomponent
import nstv.daggerplayground.MainActivity

/**
 * Created by Nicole Terc on 4/16/18.
 */

@CacheScope
@Subcomponent(modules = [(CacheModule::class)])
interface CacheSubcomponent {
    fun inject(mainActivity: MainActivity)
}