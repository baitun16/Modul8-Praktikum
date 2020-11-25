package com.example.praktikummodul8

import android.content.Context
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

//pengelolaan tampilan viewpager atau manager tata letak
class ViewPagerAdapter(private val mContext: Context, fm:
FragmentManager) :
    FragmentPagerAdapter(fm) {
    //mengembalikan fragmen untuk posisi tertentu
    override fun getItem(position: Int): Fragment {
        return if (position == 0) {
            FirstFragment.newInstance()
        } else if (position == 1){
            SecondFragment.newInstance()
        } else if (position == 2) {
            ThirdFragment.newInstance()
        }else{
            FourFragment.newInstance()
        }
    }
    //untuk mendapatkan string judul tab
    override fun getPageTitle(position: Int): CharSequence? {
        return mContext.resources.getString(TAB_TITLES[position])
    }
    //menunjukkan berapa banyak halaman yang ada
    override fun getCount(): Int {
        return 4
    }
    //untuk memanggil method atau member yang dideklarasikan
    companion object {
        @StringRes
        private val TAB_TITLES = intArrayOf(R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3, R.string.tab_text_4 )
    }
}
