package nstv.daggerplayground.app

import dagger.Component
import nstv.daggerplayground.network.NetworkModule
import nstv.daggerplayground.network.NetworkSubcomponent

/**
 * Created by Nicole Terc on 4/16/18.
 */

@AppScope
@Component(modules = [(AppModule::class)])

interface AppComponent {
    fun plusNetworkSubcomponent(networkModule: NetworkModule): NetworkSubcomponent

}