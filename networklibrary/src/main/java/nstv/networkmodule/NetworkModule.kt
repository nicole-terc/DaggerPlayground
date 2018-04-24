package nstv.networkmodule

import android.app.Application
import dagger.Module
import dagger.Provides

/**
 * Created by Nicole Terc on 4/16/18.
 */

@Module
class NetworkModule{
    @Provides
    @NetworkScope
    fun providesNetwork(app: Application): Network {
        return Network(app)
    }
}