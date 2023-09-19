package com.yndoo.mango_contents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class SplashActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        // Initialize Firebase Auth
        auth = Firebase.auth

        if(auth.currentUser?.uid == null){ //회원이 아니라면 joinActivity
            Handler().postDelayed({
                startActivity(Intent(this,JoinActivity::class.java))
                finish()
            }, 3000)
        } else {                            //회원이라면 MainActivity
            Handler().postDelayed({
                startActivity(Intent(this,MainActivity::class.java))
                finish()
            }, 3000)
        }


    }
}