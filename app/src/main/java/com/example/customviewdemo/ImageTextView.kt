package com.example.customviewdemo

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.widget.LinearLayout
import androidx.core.content.res.ResourcesCompat

class ImageTextView: LinearLayout {
    var imageSize = resources.getDimensionPixelSize(R.dimen.default_imageSize)
    var imageSrc = ResourcesCompat.getDrawable(resources,android.R.drawable.alert_dark_frame,null)
    var mainColor = Color.BLACK
    var spacing = 0
    var txtString = "預設"
    var txtSize = resources.getDimension(R.dimen.default_textSize)
    constructor(context: Context):super(context){
        initViews()
    }
    constructor(context: Context,attrs:AttributeSet):super(context,attrs){
        context.obtainStyledAttributes(attrs,R.styleable.ImageTextView)
        initViews()
    }
    constructor(context: Context,attrs:AttributeSet,defStyle:Int):super(context,attrs,defStyle){
        initViews()
    }
    private fun initViews(){

    }
}