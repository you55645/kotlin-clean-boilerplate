package dean.chang.kotlin_clean_boilerplate.ui.main.home

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import dean.chang.kotlin_clean_boilerplate.R
import dean.chang.kotlin_clean_boilerplate.ui.main.base.BaseActivity
import dean.chang.kotlin_clean_boilerplate.ui.main.example.ExampleActivity
import javax.inject.Inject

class MainActivity @Inject constructor() : BaseActivity<MainViewModel>() {

    @Inject
    lateinit var mViewmodelFactory: ViewModelProvider.Factory;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mViewModel = ViewModelProviders.of(this, mViewmodelFactory).get(MainViewModel::class.java);

        findViewById<TextView>(R.id.text).setText(mViewModel.test)
        findViewById<Button>(R.id.button).setOnClickListener {
            var intent = Intent(this, ExampleActivity::class.java)
            startActivity(intent)
        }
        Log.d("Test", mViewModel.test);
    }
}
