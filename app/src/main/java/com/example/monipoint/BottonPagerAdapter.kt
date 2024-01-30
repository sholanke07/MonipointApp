package com.example.monipoint

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter


class BottonPagerAdapter(sFM: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(sFM, lifecycle) {



    override fun getItemCount(): Int {
        return 4
    }


    override fun createFragment(position: Int): Fragment {
        return when(position){
            0->{

                AllFragment()

            }
            1->{

                FragmentTwo()
            }
            2->{
                FragmentTwo()
            }
            else->{
                Fragment()
            }
        }
    }


}