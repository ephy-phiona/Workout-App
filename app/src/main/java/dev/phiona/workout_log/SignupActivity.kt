package dev.phiona.workout_log

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class SignupActivity : AppCompatActivity() {
    lateinit var etFirst: TextInputEditText
    lateinit var etSecond: TextInputEditText
    lateinit var etEmail1: TextInputEditText
    lateinit var etPassword1: TextInputEditText
    lateinit var etPassword2: TextInputEditText
    lateinit var btnSignup: Button
    lateinit var tvLogin: TextView
    lateinit var tilFirst: TextInputLayout
    lateinit var tilSecond: TextInputLayout
    lateinit var tilEmail1: TextInputLayout
    lateinit var tilPassword1: TextInputLayout
    lateinit var tilPassword2: TextInputLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        etFirst = findViewById(R.id.etFirst)
        etSecond = findViewById(R.id.etSecond)
        etEmail1 = findViewById(R.id.etEmail1)
        etPassword1 = findViewById(R.id.etPassword1)
        etPassword2 = findViewById(R.id.etPassword2)
        btnSignup = findViewById(R.id.btnSignup)
        tvLogin = findViewById(R.id.tvLogin)
        tilFirst = findViewById(R.id.tilFirst)
        tilSecond = findViewById(R.id.tilSecond)
        tilEmail1 = findViewById(R.id.tilEmail1)
        tilPassword1 = findViewById(R.id.tilPassword1)
        tilPassword2 = findViewById(R.id.tilPassword2)


        tvLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        btnSignup.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
            validateSignUp()
        }
    }
        fun validateSignUp() {
            var email = etEmail1.text.toString()
            var password1 = etPassword1.text.toString()
            var password2 = etPassword2.text.toString()
            var firstname = etFirst.text.toString()
            var secondname = etSecond.text.toString()
            if (email.isBlank()) {
                tilEmail1.error = "Email is required?"
            }
            if (password1.isBlank()) {
                tilPassword1.error = "Password is required?"
            }
            if (password2.isBlank()) {
                tilPassword2.error = "Password is required"
            }
            if (firstname.isBlank()) {
                tilFirst.error = "First name is required"
            }
            if (secondname.isBlank()) {
                tilSecond.error = "Second name is required"
            }
        }
    }


