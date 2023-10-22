package com.example.tugas6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.tugas6.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            nextBtn.setOnClickListener {
                var homeintent = Intent(this@MainActivity2, MainActivity::class.java)
                startActivity(homeintent)
            }
        }
    }



//        setContentView(R.layout.activity_main2)


//        Handler(Looper.getMainLooper()).postDelayed({
//            // Start the main activity after the delay
//            startActivity(Intent(this@MainActivity2, MainActivity::class.java))
//            finish()
//        }, 3000)
//    }

}