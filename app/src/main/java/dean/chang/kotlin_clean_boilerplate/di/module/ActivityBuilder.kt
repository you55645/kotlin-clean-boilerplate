package dean.chang.kotlin_clean_boilerplate.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import dean.chang.kotlin_clean_boilerplate.ui.main.example.ExampleActivity
import dean.chang.kotlin_clean_boilerplate.ui.main.example.ExampleFragment
import dean.chang.kotlin_clean_boilerplate.ui.main.home.MainActivity

@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    internal abstract fun bindMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [ExampleModule::class])
    internal abstract fun bindExampleActivity(): ExampleActivity


    @ContributesAndroidInjector
    abstract fun bindExampleFragment(): ExampleFragment
}