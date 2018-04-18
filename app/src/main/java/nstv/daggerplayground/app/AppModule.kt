package nstv.daggerplayground.app

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides

/**
 * Created by Nicole Terc on 4/13/18.
 */
@Module
@AppScope
class AppModule(val app: Application){

    @Provides
    fun providesApp():Application = app

    @Provides
    fun providesContext(): Context = app

    @Provides
    fun providesText():String = "from appModule"
}