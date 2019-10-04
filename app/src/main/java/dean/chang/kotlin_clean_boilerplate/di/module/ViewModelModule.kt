package dean.chang.kotlin_clean_boilerplate.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dean.chang.kotlin_clean_boilerplate.di.ViewModelFactory
import dean.chang.kotlin_clean_boilerplate.di.ViewModelKey
import dean.chang.kotlin_clean_boilerplate.ui.main.example.ExampleViewModel
import dean.chang.kotlin_clean_boilerplate.ui.main.home.MainViewModel
import javax.inject.Singleton

@Module
abstract class ViewModelModule{
    @Singleton
    @Binds
    abstract fun provideViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun provideMainViewModel(viewModel: MainViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ExampleViewModel::class)
    abstract fun provideExampleViewModel(viewModel: ExampleViewModel): ViewModel
}