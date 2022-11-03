package com.firebaseauthproject
import android.widget.TextView
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val signUpText : TextView = findViewById(R.id.SignUpText)

        signUpText.setOnClickListener {
            val intent = Intent( this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}