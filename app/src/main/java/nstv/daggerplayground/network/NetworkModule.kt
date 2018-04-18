package nstv.daggerplayground.network

import android.app.Application
import dagger.Module
import dagger.Provides

/**
 * Created by Nicole Terc on 4/16/18.
 */

@Module
@NetworkScope
class NetworkModule{
    @Provides
    fun providesNetwork(app: Application):Network{
        return Network(app)
    }
}