package com.encoders.serilizationinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.encoders.serilizationinkotlin.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var Username: TextView
    private lateinit var Designation: TextView
    private lateinit var Company: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Username = findViewById(R.id.name)
        Designation = findViewById(R.id.designation)
        Company = findViewById(R.id.company)

        val users = intent.getSerializableExtra("USER") as Users

        Username.text = users.name
        Designation.text = users.designation
        Company.text = users.company
    }
}