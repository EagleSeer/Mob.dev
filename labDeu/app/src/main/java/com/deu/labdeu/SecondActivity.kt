package com.deu.labdeu

import android.annotation.SuppressLint
//import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    internal var number:String?=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        //get data from intent
        val intent = intent
        val name = intent.getStringExtra("Name")
        val email = intent.getStringExtra("Email")
        val number = intent.getStringExtra("Number")


        //textview
        val resultTv = findViewById<TextView>(R.id.resultTv)
        //setText
        resultTv.text = "Name: $name\nEmail: $email"

        resultTv.text="Number: $number"
//
//        val dialBtn = findViewById<Button>(R.id.dialBtn)
//        dialBtn.setOnClickListerner{
//            val number = numberEt.text.toString().trim()
//
//            val intent = Intent(Intent.ACTION_DIAL, Uri.parse(uriString:"tel:" + Uri.encode(number)))
//            startActivity(intent)
    }
}