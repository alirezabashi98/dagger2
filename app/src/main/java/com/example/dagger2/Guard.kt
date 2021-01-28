package com.example.dagger2

import android.util.Log
import javax.inject.Inject

class Guard @Inject constructor(){

    fun setGuardForMobile(mobile: Mobile){

        Log.i("TAG_TEST"," set guard Mobile ... ")

    }

}