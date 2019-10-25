package com.example.myapplication

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.second.*

class Second: AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second)
       //getting data through bundle
         val bundle:Bundle?=intent.extras
         val message= bundle!!.getString("Key")
        //setting textview value
         text_result.text=message
        /* https://medium.com/@tejumoladavid_91868/how-to-implement-an-horizontal-timed-scrolling-recyclerview-in-android-e4da369532f0
        https://blog.davidmedenjak.com/android/2017/06/24/viewpager-recyclerview.html
        https://www.tutorialkart.com/kotlin-android-tutorial/
        https://www.tutorialspoint.com/kotlin/kotlin_control_flow.htm
        https://www.javatpoint.com/kotlin-android-textview-and-edittext
        https://www.programiz.com/kotlin-programming/hello-world
        https://www.youtube.com/watch?v=VEqhzCFmEQI&list=PLlxmoA0rQ-LwgK1JsnMsakYNACYGa1cjR
        https://www.techotopia.com/index.php/Kotlin_/_Android_Studio_Development_Essentials
        https://www.programiz.com/kotlin-programming/class-objects
        https://www.techotopia.com/index.php/An_Overview_of_Android_Intents_in_Kotlin */

    }}