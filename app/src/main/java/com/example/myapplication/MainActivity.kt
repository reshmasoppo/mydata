package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {

            Toast.makeText(applicationContext,"MESSAGE",Toast.LENGTH_LONG).show()
        }
        button2.setOnClickListener{

            val name:String= editText.text.toString()
            Toast.makeText(applicationContext,"RESULT"+name,Toast.LENGTH_SHORT).show()

         //Navigate from one activity to another
          //  val intent =Intent(this,Second::class.java)
          //  intent.putExtra("Key",name)
          //  startActivity(intent)
            /* button3.setOnClickListener {
               Toast.makeText(applicationContext,"RESULT",Toast.LENGTH_SHORT).show()
            //val intent = Intent(Intent.ACTION_VIEW,
            //Uri.parse("http://www.google.com"))
             // startActivity(intent)
} }*/
          /*  val intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.google.com"))
            startActivity(intent)*/


    }
}}
