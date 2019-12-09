package cn.gridlife.jigong

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutID())
        Log.i(getCurrentClassName(),"onCreate")

    }

    abstract fun getCurrentClassName(): String?

    abstract fun getLayoutID():Int
    override fun onStart() {
        super.onStart()
        Log.i(getCurrentClassName(),"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(getCurrentClassName(),"onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(getCurrentClassName(),"onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.i(getCurrentClassName(),"onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(getCurrentClassName(),"onDestroy")
    }
}