package nstv.cachelibrary

import android.app.Application
import dagger.Component
import nstv.baselibrary.AppComponent

/**
 * Created by Nicole Terc on 4/16/18.
 */

@CacheScope
@Component(dependencies = [(AppComponent::class)], modules = [(CacheModule::class)])
interface CacheComponent {
    fun application(): Application
}