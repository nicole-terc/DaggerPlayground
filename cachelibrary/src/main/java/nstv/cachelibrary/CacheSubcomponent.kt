package nstv.cachelibrary

import dagger.Subcomponent

/**
 * Created by Nicole Terc on 4/16/18.
 */

@CacheScope
@Subcomponent(modules = [(CacheModule::class)])
interface CacheSubcomponent {
}