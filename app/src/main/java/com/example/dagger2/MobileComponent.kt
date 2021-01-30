package com.example.dagger2

import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@Component(modules = [BoardModule::class, FPScreenModule::class])
interface MobileComponent {

    fun buildMobile(): Mobile

    fun injectField(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun buildDpi( dpi: Int): Builder

        fun build(): MobileComponent

    }

}