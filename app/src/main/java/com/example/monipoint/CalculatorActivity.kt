package com.example.monipoint

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.monipoint.databinding.ActivityCalculatorBinding


class CalculatorActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCalculatorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_calculator)

        binding = ActivityCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calBackBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.proceedAirtelData.setOnClickListener {
            validation()
        }

        binding.electicLayout.setOnClickListener {

            binding.electricTxt.visibility = View.GONE
            binding.eleLayout.visibility = View.VISIBLE

            binding.docTxt.visibility = View.VISIBLE
            binding.docLayout.visibility = View.GONE

            binding.glassTxt.visibility = View.VISIBLE
            binding.glassLayout2.visibility = View.GONE

            binding.liquidTxt.visibility = View.VISIBLE
            binding.liquidLayout2.visibility = View.GONE

            binding.foodTxt.visibility = View.VISIBLE
            binding.foodLayout2.visibility = View.GONE

            binding.productTxt.visibility = View.VISIBLE
            binding.productLayout2.visibility = View.GONE

            binding.otherTxt.visibility = View.VISIBLE
            binding.otherLayout2.visibility = View.GONE

        }
        binding.docuLayout.setOnClickListener {
            binding.docTxt.visibility = View.GONE
            binding.docLayout.visibility = View.VISIBLE

            binding.electricTxt.visibility = View.VISIBLE
            binding.eleLayout.visibility = View.GONE

            binding.glassTxt.visibility = View.VISIBLE
            binding.glassLayout2.visibility = View.GONE

            binding.liquidTxt.visibility = View.VISIBLE
            binding.liquidLayout2.visibility = View.GONE

            binding.foodTxt.visibility = View.VISIBLE
            binding.foodLayout2.visibility = View.GONE

            binding.productTxt.visibility = View.VISIBLE
            binding.productLayout2.visibility = View.GONE

            binding.otherTxt.visibility = View.VISIBLE
            binding.otherLayout2.visibility = View.GONE
        }

        binding.glassLayout.setOnClickListener {
            binding.glassTxt.visibility = View.GONE
            binding.glassLayout2.visibility = View.VISIBLE

            binding.docTxt.visibility = View.VISIBLE
            binding.docLayout.visibility = View.GONE

            binding.electricTxt.visibility = View.VISIBLE
            binding.eleLayout.visibility = View.GONE

            binding.liquidTxt.visibility = View.VISIBLE
            binding.liquidLayout2.visibility = View.GONE

            binding.foodTxt.visibility = View.VISIBLE
            binding.foodLayout2.visibility = View.GONE

            binding.productTxt.visibility = View.VISIBLE
            binding.productLayout2.visibility = View.GONE

            binding.otherTxt.visibility = View.VISIBLE
            binding.otherLayout2.visibility = View.GONE
        }
        binding.liquidLayout.setOnClickListener {
            binding.liquidTxt.visibility = View.GONE
            binding.liquidLayout2.visibility = View.VISIBLE

            binding.glassTxt.visibility = View.VISIBLE
            binding.glassLayout2.visibility = View.GONE

            binding.docTxt.visibility = View.VISIBLE
            binding.docLayout.visibility = View.GONE

            binding.electricTxt.visibility = View.VISIBLE
            binding.eleLayout.visibility = View.GONE

            binding.foodTxt.visibility = View.VISIBLE
            binding.foodLayout2.visibility = View.GONE

            binding.productTxt.visibility = View.VISIBLE
            binding.productLayout2.visibility = View.GONE

            binding.otherTxt.visibility = View.VISIBLE
            binding.otherLayout2.visibility = View.GONE
        }
        binding.foodLayout.setOnClickListener {
            binding.foodTxt.visibility = View.GONE
            binding.foodLayout2.visibility = View.VISIBLE

            binding.glassTxt.visibility = View.VISIBLE
            binding.glassLayout2.visibility = View.GONE

            binding.docTxt.visibility = View.VISIBLE
            binding.docLayout.visibility = View.GONE

            binding.liquidTxt.visibility = View.VISIBLE
            binding.liquidLayout2.visibility = View.GONE

            binding.electricTxt.visibility = View.VISIBLE
            binding.eleLayout.visibility = View.GONE

            binding.productTxt.visibility = View.VISIBLE
            binding.productLayout2.visibility = View.GONE

            binding.otherTxt.visibility = View.VISIBLE
            binding.otherLayout2.visibility = View.GONE
        }
        binding.productLayout.setOnClickListener {
            binding.productTxt.visibility = View.GONE
            binding.productLayout2.visibility = View.VISIBLE

            binding.foodTxt.visibility = View.VISIBLE
            binding.foodLayout2.visibility = View.GONE

            binding.glassTxt.visibility = View.VISIBLE
            binding.glassLayout2.visibility = View.GONE

            binding.docTxt.visibility = View.VISIBLE
            binding.docLayout.visibility = View.GONE

            binding.liquidTxt.visibility = View.VISIBLE
            binding.liquidLayout2.visibility = View.GONE

            binding.electricTxt.visibility = View.VISIBLE
            binding.eleLayout.visibility = View.GONE

            binding.otherTxt.visibility = View.VISIBLE
            binding.otherLayout2.visibility = View.GONE
        }
        binding.otherLayout.setOnClickListener {
            binding.otherTxt.visibility = View.GONE
            binding.otherLayout2.visibility = View.VISIBLE

            binding.productTxt.visibility = View.VISIBLE
            binding.productLayout2.visibility = View.GONE

            binding.foodTxt.visibility = View.VISIBLE
            binding.foodLayout2.visibility = View.GONE

            binding.glassTxt.visibility = View.VISIBLE
            binding.glassLayout2.visibility = View.GONE

            binding.docTxt.visibility = View.VISIBLE
            binding.docLayout.visibility = View.GONE

            binding.liquidTxt.visibility = View.VISIBLE
            binding.liquidLayout2.visibility = View.GONE

            binding.electricTxt.visibility = View.VISIBLE
            binding.eleLayout.visibility = View.GONE

        }
    }

    private fun validation(){
        val sender = binding.editSender.text.toString()
        val weight = binding.editWeight.text.toString()
        val receiver = binding.editReceiver.text.toString()
        if (sender.isEmpty()){
            Toast.makeText(this, "Sender location required", Toast.LENGTH_SHORT).show()
            return
        }
        if (receiver.isEmpty()){
            Toast.makeText(this, "Receiver location required", Toast.LENGTH_SHORT).show()
            return
        }
        if (weight.isEmpty()){
            Toast.makeText(this, "Package Weight required", Toast.LENGTH_SHORT).show()
            return
        }

        val intent = Intent(this, ModeActivity::class.java)
        startActivity(intent)
    }

}