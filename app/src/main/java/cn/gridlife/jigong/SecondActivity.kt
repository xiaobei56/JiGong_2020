package cn.gridlife.jigong

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class SecondActivity : BaseActivity() {



    fun action2(view: View) {
//        startActivity()
        startActivity(Intent(this,MainActivity::class.java ))
    }
    override fun getCurrentClassName(): String? {
        return SecondActivity::class.java.simpleName
    }

    override fun getLayoutID(): Int {
        return R.layout.activity_second
    }
}
