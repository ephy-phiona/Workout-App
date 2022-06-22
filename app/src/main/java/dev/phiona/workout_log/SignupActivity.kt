package dev.phiona.workout_log

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.util.Patterns.EMAIL_ADDRESS
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.util.PatternsCompat.EMAIL_ADDRESS
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import dev.phiona.workout_log.databinding.ActivityLoginBinding
import dev.phiona.workout_log.databinding.ActivitySignupBinding
import java.util.regex.Pattern

class SignupActivity : AppCompatActivity() {
    lateinit var binding:ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.tvLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        binding.btnSignup.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
            validateSignUp()
        }
    }
        fun validateSignUp() {
            var email = binding.etEmail1.text.toString()
            var password1 = binding.etPassword1.text.toString()
            var password2 = binding.etPassword2.text.toString()
            var firstname = binding.etFirst.text.toString()
            var secondname = binding.etSecond.text.toString()
            if (email.isBlank()) {
                binding.tilEmail1.error = "Email is required?"
            }
            if (!Patterns.EMAIL_ADDRESS.matcher(email). matches()){
                binding.tilEmail1.error="Invalid email"
            }
            if (password1.isBlank()) {
                binding.tilPassword1.error = "Password is required?"
            }
//            if (password2.isBlank()) {
//                tilPassword2.error = "Password is required"
//            }
            if (password2 !=password1){
               binding.tilPassword2.error="Unmatched password!"
            }
            else{
                Toast.makeText(applicationContext, "Confirmed password", Toast.LENGTH_SHORT).show()
            }

            if (firstname.isBlank()) {
                binding.tilFirst.error = "First name is required"
            }
            if (secondname.isBlank()) {
                binding.tilSecond.error = "Second name is required"
            }
        }

    }


