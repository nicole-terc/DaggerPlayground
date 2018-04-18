package nstv.daggerplayground

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import nstv.daggerplayground.cache.Cache
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var cache: Cache
    @Inject
    lateinit var fromApp: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MyApplication.get().plusCacheSubcomponent().inject(this)
        updatetext()
    }

    fun updatetext() {
        textMessage.text = cache.getText()
    }
}
