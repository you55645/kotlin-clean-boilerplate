package dean.chang.kotlin_clean_boilerplate.di.component

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dean.chang.kotlin_clean_boilerplate.MyApplication
import dean.chang.kotlin_clean_boilerplate.di.module.ActivityBuilder
import dean.chang.kotlin_clean_boilerplate.di.module.AppModule
import dean.chang.kotlin_clean_boilerplate.di.module.ViewModelModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AppModule::class,
        ActivityBuilder::class,
        ViewModelModule::class
    ]
)
interface AppComponent : AndroidInjector<MyApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(myApplication: MyApplication): Builder

        fun build(): AppComponent
    }
}