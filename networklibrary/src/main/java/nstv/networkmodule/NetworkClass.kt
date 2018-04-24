package nstv.networkmodule

import javax.inject.Inject

/**
 * Created by Nicole Terc on 4/24/18.
 */
class NetworkClass{
    @Inject
    lateinit var network:Network

    init {
        DaggerNetworkSubcomponent.builder().build().inject(this)
    }

    fun getText():String{
        return network.getText()
    }
}