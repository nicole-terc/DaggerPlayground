package nstv.baselibrary

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides

/**
 * Created by Nicole Terc on 4/13/18.
 */
@Module
class AppModule(val app: Application){

    @AppScope
    @Provides
    fun providesApp():Application = app

    @AppScope
    @Provides
    fun providesContext(): Context = app

    @AppScope
    @Provides
    fun providesText():String = "from appModule"
}