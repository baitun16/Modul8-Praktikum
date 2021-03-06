package com.example.praktikummodul8

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.Observer

class ThirdFragment  : Fragment() {
    // TODO: Rename and change types of parameters
    //menginisialisasi fragmen dalam aktivitas host
    private var communicationViewModel: CommunicationViewModel? = null
    private var txtName: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        communicationViewModel = ViewModelProviders.
        of(requireActivity()).   get(CommunicationViewModel::class.java)
    }
    //mengambil instance layoutinflater berdasarkan file resource tata letak
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?     ): View? {
        return inflater.inflate(R.layout.fragment_third,
            container, false)     
    }
     //menginisialisasi tampilan root input text name
    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)
        txtName = view.findViewById(R.id.textViewName)
        communicationViewModel!!.name.observe(requireActivity(),
            Observer { s -> txtName!!.text = s })
    }
    //untuk memanggil method atau member yang dideklarasikan
    companion object {

        fun newInstance(): ThirdFragment{
            return ThirdFragment()
        }
    }
}
