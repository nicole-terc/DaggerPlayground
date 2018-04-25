package nstv.networkmodule

import android.app.Application
import javax.inject.Inject

/**
 * Created by Nicole Terc on 4/24/18.
 */
class NetworkInjectorClass {

    @Inject
    lateinit var network: Network

    @Inject
    lateinit var app: Application

}