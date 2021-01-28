package com.example.dagger2

import dagger.Binds
import dagger.Component

@Component
interface MobileComponent {

    fun buildMobile(): Mobile

    fun injectField(mainActivity: MainActivity)

}