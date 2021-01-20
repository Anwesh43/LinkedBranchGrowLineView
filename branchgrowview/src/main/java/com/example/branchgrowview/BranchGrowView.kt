package com.example.branchgrowview

import android.view.View
import android.view.MotionEvent
import android.graphics.Paint
import android.graphics.Canvas
import android.graphics.Color
import android.app.Activity
import android.content.Context

val colors : Array<Int> = arrayOf(
    "#F44336",
    "#673AB7",
    "#FF9800",
    "#795548",
    "#2196F3"
).map {
    Color.parseColor(it)
}.toTypedArray()
val parts : Int = 3
val scGap : Float = 0.02f / parts
val strokeFactor : Float = 90f
val branches : Int = 5
val sizeFactor : Float = 2.9f
val lFactor : Float = 8.1f
val backColor : Int = Color.parseColor("#BDBDBD")
val delay : Long = 20
