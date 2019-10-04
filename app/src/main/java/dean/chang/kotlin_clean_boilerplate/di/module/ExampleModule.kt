package dean.chang.kotlin_clean_boilerplate.di.module

import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import dean.chang.kotlin_clean_boilerplate.ui.main.example.ExampleFragment
import dean.chang.kotlin_clean_boilerplate.ui.main.example.ExampleViewModel

@Module
class ExampleModule {

    @Provides
    fun provideExampleViewModel(): ExampleViewModel{
        return ExampleViewModel()
    }
}