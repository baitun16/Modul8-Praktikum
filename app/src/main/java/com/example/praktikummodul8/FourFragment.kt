package com.example.praktikummodul8


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView


class FourFragment  : Fragment() {

//mengambil instance layoutinflater berdasarkan file resource tata letak
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?     ): View? {
        return inflater.inflate(R.layout.fragment_four, container, false)
    }
    //menginisialisasi tampilan root list view
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val listview = view.findViewById<ListView>(R.id.lv)
        val items = arrayOf("Baitun Nadhiroh", "Haqul Yakin", "Anik Ruswaidah", "Umar Said","Jamaludin Al Afghani")
        val adapter = ArrayAdapter(activity!!, android.R.layout.simple_list_item_1, items)
        listview.setAdapter(adapter)
    }
    //untuk memanggil method atau member yang dideklarasikan
    companion object {

        fun newInstance(): FourFragment{
            return FourFragment()
        }
    }
}