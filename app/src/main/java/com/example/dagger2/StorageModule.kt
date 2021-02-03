package com.example.dagger2

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class StorageModule {

    @Singleton
    @Provides
    fun buildStorage(): Storage = Storage()

}