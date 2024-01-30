package com.example.monipoint


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager.OnPageChangeListener
import androidx.viewpager2.widget.ViewPager2
import com.example.monipoint.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewPager3: ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.etSearch.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }


        binding.bottomNavigation.setItemIconTintList(null)


        binding.bottomNavigation.setOnNavigationItemSelectedListener { item ->

            when (item.itemId) {
                R.id.home -> {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    return@setOnNavigationItemSelectedListener true
                }

                R.id.calculator -> {
                    val intent = Intent(this, CalculatorActivity::class.java)
                    startActivity(intent)
                    return@setOnNavigationItemSelectedListener true
                }

                R.id.shipment -> {
                    val intent = Intent(this, Shipment::class.java)
                    startActivity(intent)
                    return@setOnNavigationItemSelectedListener true
                }

                R.id.profile -> {

                    return@setOnNavigationItemSelectedListener true

                }

            }
            false
        }



    }
}