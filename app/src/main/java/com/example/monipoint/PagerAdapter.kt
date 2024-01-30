package com.example.monipoint

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter


class PagerAdapter(sFM: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(sFM, lifecycle) {



    override fun getItemCount(): Int {
        return 5
    }


    override fun createFragment(position: Int): Fragment {
        return when(position){
            0->{

                AllFragment()

            }
            1->{

                CompletedFragment()
            }
            2->{
                FragmentTwo()
            }
            3->{
                PendingFragment()
            }
            4->{
                CancelFragment()
            }
            else->{
                Fragment()
            }
        }
    }


}