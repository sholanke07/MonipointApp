package com.example.monipoint

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.monipoint.databinding.ActivityShipmentBinding
//import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class Shipment : AppCompatActivity() {
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2
    //private lateinit var adapter: PagerAdapter

    private lateinit var binding: ActivityShipmentBinding
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_shipment)

        binding = ActivityShipmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


        tabLayout = findViewById(R.id.tabLayout)
        viewPager2 = findViewById(R.id.viewpager2)

        val adapter = PagerAdapter(supportFragmentManager, lifecycle)

        viewPager2.adapter= adapter


        TabLayoutMediator(tabLayout, viewPager2){tab, position->
            when(position){
                0->{
                    tab.setText("All 12")
                   // tab.setIcon(R.drawable.placeholder)

                }
                1->{
                    tab.text = "Completed 5"
                    //tab.setIcon(R.drawable.placeholder)
                }
                2->{
                    tab.text = "In progress 3"
                    //tab.setIcon(R.drawable.placeholder)
                }
                3->{
                    tab.text = "Pending order 4"
                    //tab.setIcon(R.drawable.placeholder)
                }
                4->{
                    tab.text = "Cancelled"
                    //tab.setIcon(R.drawable.placeholder)
                }
            }

        }.attach()
    }

//    private fun setUpTabs(){
//        val adapter = PagerAdapter(supportFragmentManager)
//        adapter.addFragment(AllFragment(), "All")
//        adapter.addFragment(FragmentTwo(), "Completed")
//        adapter.addFragment(FragmentTwo(), "In progress")
//        adapter.addFragment(FragmentTwo(), "Pr")
//        adapter.addFragment(FragmentTwo(), "Completed")
//
//        viewPager.adapter = adapter
//        tabLayout.setupWithViewPager(viewPager)
//
//        tabLayout.getTabAt(0)!!.setIcon(R.drawable.placeholder)
//        tabLayout.getTabAt(1)!!.setIcon(R.drawable.ic_baseline_navigate)
//        tabLayout.getTabAt(2)!!.setIcon(R.drawable.image_event)
//        tabLayout.getTabAt(3)!!.setIcon(R.drawable.placeholder)
//        tabLayout.getTabAt(4)!!.setIcon(R.drawable.placeholder)
//    }
}