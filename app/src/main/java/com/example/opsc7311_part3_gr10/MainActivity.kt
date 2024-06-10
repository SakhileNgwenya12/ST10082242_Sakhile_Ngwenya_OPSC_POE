package com.example.opsc7311_part3_gr10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
//import com.google.firebase.auth.FirebaseAuth
//import com.google.firebase.auth.FirebaseUser

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

setContentView(R.layout.activity_register)
        val regUsername : String;
        val regPassword : String;
        // Initialize Firebase Auth
     //   auth = FirebaseAuth.getInstance()

        val buttonLog = findViewById<Button>(R.id.btnLogin)
        val usernameText = findViewById<EditText>(R.id.etUsername)
        val passwordText = findViewById<EditText>(R.id.etPassword)

        buttonLog.setOnClickListener {
    /*
            val username = usernameText.text.toString().trim()
            val password = passwordText.text.toString().trim()

            if (username.isEmpty()) {
                usernameText.error = "Please enter username"
                usernameText.requestFocus()
            } else if (password.isEmpty()) {
                passwordText.error = "Please enter password"
                passwordText.requestFocus()
            } else {
                val Intent = Intent(this, HomePage::class.java)
                startActivity(Intent)

            }

    */
        }
    }
}