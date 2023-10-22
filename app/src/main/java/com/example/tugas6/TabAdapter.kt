package com.example.tugas6

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class TabAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        // Mengembalikan jumlah tampilan atau halaman dalam ViewPager
        return 2 // Gantilah sesuai dengan jumlah halaman yang Anda inginkan
    }

    override fun createFragment(position: Int): Fragment {
        // Membuat dan mengembalikan fragment yang sesuai dengan posisi
        when (position) {
            0 -> return RegisterFragment()
            1 -> return LoginFragment()
//            2 -> return HomepageFragment()
            else -> throw IllegalArgumentException("Position out of array")
        }
    }
}
