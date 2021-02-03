package com.example.dagger2

import android.util.Log
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class BoardModule {

//    @Provides
//    fun buildCamera(): Camera = Camera()

    @Provides
    fun buildBoard(camera: Camera, storage: Storage): Board {

        Log.i("TAG_TEST", "Create Camera : $camera & Storage : $storage")
        return Board(storage, camera)
    }

}