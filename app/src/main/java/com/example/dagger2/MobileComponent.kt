package com.example.dagger2

import dagger.BindsInstance
import dagger.Subcomponent

@ActivityScope
@Subcomponent(
    modules = [BoardModule::class, FPScreenModule::class]
)
interface MobileComponent {

    fun buildMobile(): Mobile

    fun injectField(mainActivity: MainActivity)

    @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        fun buildDpi(@Dpi dpi: Int): Builder

        @BindsInstance
        fun buildGorillaGlass(@GorillaGlass gorillaGlass: Int): Builder

        fun build(): MobileComponent

    }

}