package com.example.opsc7311_part3_gr10
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.opsc7311_part3_gr10.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.DatabaseReference


class Register : AppCompatActivity() {
    private lateinit var editTextUsername: TextInputEditText
    private lateinit var editTextPassword: TextInputEditText
    private lateinit var buttonReg: Button

    //Database reference
    private lateinit var binding: ActivityMainBinding
    private lateinit var database: DatabaseReference


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        editTextUsername = findViewById(R.id.etRegUsername)
        editTextPassword = findViewById(R.id.etRegPassword)
        buttonReg = findViewById(R.id.btnRegister)

        buttonReg.setOnClickListener {
            val username: String = editTextUsername.text.toString()
            val password: String = editTextPassword.text.toString()

            if (username.isEmpty()) {
                Toast.makeText(this@Register, "Enter Username", Toast.LENGTH_SHORT).show()
            }

            if (password.isEmpty()) {
                Toast.makeText(this@Register, "Enter Password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}