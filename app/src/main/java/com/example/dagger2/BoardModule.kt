package com.example.dagger2

import dagger.Module
import dagger.Provides

@Module
abstract class BoardModule {

    @Provides
    fun buildCamera(): Camera = Camera()

    @Provides
    fun buildStorage(): Storage = Storage()

    @Provides
    fun buildBoard(camera: Camera, storage: Storage): Board = Board(storage, camera)

}