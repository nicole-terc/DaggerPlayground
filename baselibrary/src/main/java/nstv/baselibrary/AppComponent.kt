package nstv.baselibrary

import android.app.Application
import android.content.Context
import dagger.Component

/**
 * Created by Nicole Terc on 4/16/18.
 */

@AppScope
@Component(modules = [(AppModule::class)])

interface AppComponent {
    fun application(): Application
    fun context(): Context
    fun appModuleText(): String
}