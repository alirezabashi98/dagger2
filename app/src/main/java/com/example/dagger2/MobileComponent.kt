package com.example.dagger2

import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [BoardModule::class, FPScreenModule::class])
interface MobileComponent {

    fun buildMobile(): Mobile

    fun injectField(mainActivity: MainActivity)

    @Component.Factory
    interface Factory {


        fun create(
            @BindsInstance @Dpi dpi: Int,
            @BindsInstance @GorillaGlass gorillaGlass: Int
        ): MobileComponent

    }

}