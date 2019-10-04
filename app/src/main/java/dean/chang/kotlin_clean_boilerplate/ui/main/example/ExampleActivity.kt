package dean.chang.kotlin_clean_boilerplate.ui.main.example

import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import dean.chang.kotlin_clean_boilerplate.R
import dean.chang.kotlin_clean_boilerplate.ui.main.base.BaseActivity
import javax.inject.Inject

class ExampleActivity @Inject constructor() : BaseActivity<ExampleViewModel>() {
    @Inject
    lateinit var mViewmodelFactory: ViewModelProvider.Factory;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example)

        mViewModel = ViewModelProviders.of(this, mViewmodelFactory).get(ExampleViewModel::class.java)

        Log.d("Test", mViewModel.text);

        ExampleFragment().apply {
            supportFragmentManager?.beginTransaction()?.add(R.id.content_frame, this)?.commit()
        }
    }
}
