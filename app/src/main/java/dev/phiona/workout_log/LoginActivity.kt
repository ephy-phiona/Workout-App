package dev.phiona.workout_log

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import dev.phiona.workout_log.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding:ActivityLoginBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


            binding.tvSignup.setOnClickListener{
            val intent= Intent(this,SignupActivity::class.java)
            startActivity(intent)
        }
        binding.btnLogin.setOnClickListener {
            val  intent= Intent(this,HomeActivity::class.java)
            startActivity(intent)
            validate()
        }
    }
    fun validate(){
        var Email=binding.etEmail1.text.toString()
        var Password=binding.etPassword.text.toString()
        if (Email.isBlank()){
             binding.tilEmail1.error="Email is required?"
        }
        if (Password.isBlank()){
            binding.tilPassword.error="Password is required?"
        }


    }
}