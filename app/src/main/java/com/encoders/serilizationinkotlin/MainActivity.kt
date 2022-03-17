package com.encoders.serilizationinkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    private lateinit var Username: TextView
    private lateinit var Designation: TextView
    private lateinit var Company: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Username = findViewById(R.id.name)
        Designation = findViewById(R.id.designation)
        Company = findViewById(R.id.company)

        val users = Users()
        users.name = Username.text.toString()
        users.designation = Designation.text.toString()
        users.company = Company.text.toString()


        val pass_object: AppCompatButton = findViewById(R.id.pass_object)
        pass_object.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("USER", users as java.io.Serializable)
            startActivity(intent)
        }

    }
}