package com.example.dagger2

import dagger.Component

@Component
interface MobileComponent {

    fun buildMobile(): Mobile

}