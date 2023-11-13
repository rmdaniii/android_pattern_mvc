package com.tantawii.androidarchitecturepattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.tantawii.androidarchitecturepattern.databinding.ActivityMainBinding
import com.tantawii.androidarchitecturepattern.ui.MainController

class MainActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityMainBinding
    private val mainController : MainController = MainController()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initUi()

    }
    private fun initUi() {
        binding.btnLogin.setOnClickListener {
          if ( mainController.login(
                  binding.usernameEdittext.text.toString(),
                  binding.passwordEdittext.text.toString()) == 1 ) {
              Toast.makeText(this, "Login is succeeded ", Toast.LENGTH_SHORT).show()
          } else Toast.makeText(this, "Login is Failed ", Toast.LENGTH_SHORT).show()
        }
    }

}