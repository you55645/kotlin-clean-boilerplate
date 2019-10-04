package dean.chang.kotlin_clean_boilerplate.di

import androidx.lifecycle.ViewModel
import dagger.MapKey
import kotlin.reflect.KClass

@Target(allowedTargets = [AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER])
@MapKey
annotation class ViewModelKey (val value: KClass<out ViewModel>)