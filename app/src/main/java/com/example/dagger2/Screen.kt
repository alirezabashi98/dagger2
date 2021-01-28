package com.example.dagger2

import javax.inject.Inject

class Screen @Inject constructor(lcd: Lcd,touch: Touch) {
}