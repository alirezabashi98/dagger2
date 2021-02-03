package com.example.dagger2

import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@ActivityScope
@Component(
    dependencies = [StorageComponent::class],
    modules = [BoardModule::class, FPScreenModule::class]
)
interface MobileComponent {

    fun buildMobile(): Mobile

    fun injectField(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun buildDpi(@Dpi dpi: Int): Builder

        @BindsInstance
        fun buildGorillaGlass(@GorillaGlass gorillaGlass: Int): Builder

        fun buildStorageComponent(storageComponent: StorageComponent): Builder

        fun build(): MobileComponent

    }

}