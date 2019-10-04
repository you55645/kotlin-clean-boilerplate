package dean.chang.kotlin_clean_boilerplate.ui.main.home

import dean.chang.kotlin_clean_boilerplate.ui.main.base.BaseViewModel
import javax.inject.Inject

class MainViewModel @Inject constructor(): BaseViewModel() {

    var test = "MainViewModel";

    override fun start() {
    }

    override fun stop() {
    }

}