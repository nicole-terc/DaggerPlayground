package nstv.daggerplayground.network

import dagger.Subcomponent

/**
 * Created by Nicole Terc on 4/16/18.
 */

@NetworkScope
@Subcomponent(modules = [(NetworkModule::class)])
interface NetworkSubcomponent{

}