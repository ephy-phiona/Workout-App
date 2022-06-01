package dev.phiona.workout_log

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {
    lateinit var btnLogin: Button
    lateinit var etEmail: TextInputEditText
    lateinit var etPassword: TextInputEditText
    lateinit var tilEmail: TextInputLayout
    lateinit var tilPassword: TextInputLayout

    lateinit var tvSignup: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent= Intent(this,LoginActivity::class.java)
        setContentView(R.layout.activity_login)

        btnLogin=findViewById(R.id.btnLogin)
        etEmail=findViewById(R.id.etEmail1)
        etPassword=findViewById(R.id.etPassword)
        tilEmail=findViewById(R.id.tilEmail1)
        tilPassword=findViewById(R.id.tilPassword)
        tvSignup=findViewById(R.id.tvSignup)

        tvSignup.setOnClickListener{
            val intent= Intent(this,SignupActivity::class.java)
            startActivity(intent)
        }
        btnLogin.setOnClickListener {
            val  intent= Intent(this,LoginActivity::class.java)
            startActivity(intent)
            validate()
        }
    }
    fun validate(){
        var Email=etEmail.text.toString()
        var Password=etPassword.text.toString()
        if (Email.isBlank()){
             tilEmail.error="Email is required?"
        }
        if (Password.isBlank()){
            tilPassword.error="Password is required?"
        }
    }
}