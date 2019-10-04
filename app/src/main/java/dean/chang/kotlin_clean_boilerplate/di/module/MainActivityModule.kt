package dean.chang.kotlin_clean_boilerplate.di.module

import dagger.Module
import dagger.Provides
import dean.chang.kotlin_clean_boilerplate.ui.main.home.MainViewModel

@Module
class MainActivityModule {

    @Provides
    fun provideMainViewMode(): MainViewModel{
        return MainViewModel();
    }

}
