package com.example.dagger2

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [StorageModule::class])
interface StorageComponent {

    fun buildStorage(): Storage

}