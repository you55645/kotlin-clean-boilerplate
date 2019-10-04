package dean.chang.kotlin_clean_boilerplate.ui.main.example

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import dean.chang.kotlin_clean_boilerplate.R
import dean.chang.kotlin_clean_boilerplate.ui.main.base.BaseFragment
import javax.inject.Inject

class ExampleFragment @Inject constructor() : BaseFragment<ExampleViewModel>(){
    @Inject
    lateinit var mViewModelFactory: ViewModelProvider.Factory

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater.inflate(R.layout.fragment_example, container, false)

        mViewModel = ViewModelProviders.of(this, mViewModelFactory).get(ExampleViewModel::class.java)
        view.findViewById<TextView>(R.id.text).setText(mViewModel.text)

        return view
    }
}