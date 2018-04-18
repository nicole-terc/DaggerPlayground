package nstv.daggerplayground.cache

import android.app.Application
import nstv.daggerplayground.network.Network

/**
 * Created by Nicole Terc on 4/16/18.
 */
class Cache(var app: Application, var network: Network) {
    fun getText(): String = "Text from cache with network text: " + network.getText()
}