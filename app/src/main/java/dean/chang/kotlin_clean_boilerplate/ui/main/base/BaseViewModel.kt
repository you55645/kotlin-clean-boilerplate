package dean.chang.kotlin_clean_boilerplate.ui.main.base

import androidx.lifecycle.ViewModel
import io.reactivex.disposables.Disposable

abstract class BaseViewModel: ViewModel(){
    private var disposable: Disposable? = null

    abstract fun start()
    abstract fun stop()
}