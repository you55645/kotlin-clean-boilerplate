package dean.chang.kotlin_clean_boilerplate.ui.main.base

import dagger.android.support.DaggerFragment

abstract class BaseFragment<T: BaseViewModel> : DaggerFragment(){
    lateinit var mViewModel:T

    override fun onDestroy() {
        super.onDestroy()
        mViewModel.stop();
    }
}