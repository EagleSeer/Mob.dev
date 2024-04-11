package com.deu.labdeu

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nameEt = findViewById<EditText>(R.id.nameEt)
        val emailEt = findViewById<EditText>(R.id.emailEt)
        val saveBtn = findViewById<Button>(R.id.saveBtn)

        //handle save button click
        saveBtn.setOnClickListener {
            //get text from edittexts
            val name = nameEt.text.toString()
            val email = emailEt.text.toString()


            //intent to start activity
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra("Name", name)
            intent.putExtra("Email", email)
            startActivity(intent)

        }
        val numberEt = findViewById<EditText>(R.id.numberEt)
        val dialBtn = findViewById<Button>(R.id.dialBtn)

        // send button
        dialBtn.setOnClickListener {
            //get text from edittexts
            val number = numberEt.text.toString()
//            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + Uri.encode(number)))
            intent.putExtra("Number", number)
            startActivity(intent)
        }
    }
}