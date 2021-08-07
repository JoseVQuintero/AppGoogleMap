package com.danisable.appgooglemap.domain

import android.graphics.Point
import com.google.firebase.firestore.GeoPoint

data class Locations(
    val name: String = "",
    val description: String = "",
    val position: GeoPoint
)