package dean.chang.kotlin_clean_boilerplate.di.module

import android.content.Context
import dagger.Module
import dagger.Provides
import dean.chang.kotlin_clean_boilerplate.MyApplication
import android.app.Application
import dagger.Binds


@Module
abstract class AppModule {

    @Binds
    abstract fun provideContext(myApplication: MyApplication): Context
    @Binds
    abstract fun provideApplication(myApplication: MyApplication): MyApplication
}