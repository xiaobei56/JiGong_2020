package cn.gridlife.jigong

import android.content.Intent
import android.view.View

class MainActivity : BaseActivity() {



    fun action2(view: View) {
        startActivity(Intent(this,SecondActivity::class.java))
    }

    override fun getCurrentClassName(): String? {
        return MainActivity::class.java.simpleName
    }

    override fun getLayoutID(): Int {
        return R.layout.activity_record
    }
}
