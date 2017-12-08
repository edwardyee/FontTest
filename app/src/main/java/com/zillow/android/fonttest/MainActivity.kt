package com.zillow.android.fonttest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.style.TextAppearanceSpan
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val v = findViewById<TextView>(R.id.spannable)

        val builder = SpannableStringBuilder("Hello world, this is a spannable string")
        builder.setSpan(TextAppearanceSpan(this, R.style.FontSpan), 0, 5, Spanned.SPAN_INCLUSIVE_INCLUSIVE )
        v.text = builder
    }
}
