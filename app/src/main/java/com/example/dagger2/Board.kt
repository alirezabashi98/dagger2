package com.example.dagger2

import javax.inject.Inject

class Board @Inject constructor(storage: Storage, camera: Camera) {
}