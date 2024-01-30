package com.example.monipoint

import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.RelativeSizeSpan
import android.text.style.StyleSpan
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.monipoint.databinding.ActivityModeBinding

class ModeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityModeBinding

    private var counter = 0
    private val total = 1480 // the total number

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_mode)

        binding = ActivityModeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.backHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


        //when you want to start the counting start the thread bellow.
        Thread {
            while (counter < total) {
                try {
                    Thread.sleep(5)
                } catch (e: InterruptedException) {
                    // TODO Auto-generated catch block
                    e.printStackTrace()
                }
                binding.amtTxt.post(Runnable { binding.amtTxt.setText("" + counter) })
                counter++
            }
        }.start()

    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}