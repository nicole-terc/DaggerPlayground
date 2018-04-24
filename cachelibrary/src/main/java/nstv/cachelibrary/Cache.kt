package nstv.cachelibrary

import android.app.Application

/**
 * Created by Nicole Terc on 4/16/18.
 */
class Cache(var app: Application) {
    fun getText(): String = "Text from cache"
}