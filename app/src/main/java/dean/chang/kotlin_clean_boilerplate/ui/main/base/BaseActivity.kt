package dean.chang.kotlin_clean_boilerplate.ui.main.base

import dagger.android.support.DaggerAppCompatActivity

abstract class BaseActivity<T: BaseViewModel>: DaggerAppCompatActivity() {
    lateinit var mViewModel:T


    override fun onDestroy() {
        super.onDestroy()
        mViewModel.stop()
    }
}