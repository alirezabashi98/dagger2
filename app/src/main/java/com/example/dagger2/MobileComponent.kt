package com.example.dagger2

import dagger.Component

@Component(modules = [BoardModule::class])
interface MobileComponent {

    fun buildMobile(): Mobile

    fun injectField(mainActivity: MainActivity)

}