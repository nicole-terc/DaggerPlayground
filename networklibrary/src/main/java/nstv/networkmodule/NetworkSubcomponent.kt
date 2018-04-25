package nstv.networkmodule

import android.app.Application
import dagger.Component
import nstv.baselibrary.AppComponent

/**
 * Created by Nicole Terc on 4/16/18.
 */

@NetworkScope
@Component(dependencies = [(AppComponent::class)], modules = [(NetworkModule::class)])
interface NetworkSubcomponent{
    fun application():Application
    fun appModuleText():String

    fun inject(networkInjectorClass: NetworkInjectorClass)
}