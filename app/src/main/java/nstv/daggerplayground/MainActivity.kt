package nstv.daggerplayground

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import nstv.networkmodule.NetworkInjectorClass

class MainActivity : AppCompatActivity() {

    var networkInjectorClass = NetworkInjectorClass()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MyApplication.instance.networkComponent().inject(networkInjectorClass)
        updatetext()
    }

    fun updatetext() {
        findViewById<TextView>(R.id.textMessage).text = networkInjectorClass.network.getText()
    }
}
