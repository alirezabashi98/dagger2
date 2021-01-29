package com.example.dagger2

import dagger.Binds
import dagger.Module

@Module
abstract class NotFPScreenModule {

    @Binds
    abstract fun buildNotFPScreen(notFPScreen: NotFPScreen): Screen

}