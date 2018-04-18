package nstv.daggerplayground.cache

import android.app.Application

/**
 * Created by Nicole Terc on 4/16/18.
 */
class Cache(var app: Application) {
    fun getText():String = "From cache"
}