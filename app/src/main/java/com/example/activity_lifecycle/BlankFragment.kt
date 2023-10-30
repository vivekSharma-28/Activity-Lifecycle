package com.example.activity_lifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

class BlankFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        Toast.makeText(requireContext(),"Account OnCreateView Called", Toast.LENGTH_LONG).show()
        Log.e("abc","Account OnCreateView Called")
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
//        Toast.makeText(requireContext(),"Account OnAttach Called", Toast.LENGTH_LONG).show()
        Log.e("abc","Account OnAttach Called")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        Toast.makeText(requireContext(),"Account OnCreate Called", Toast.LENGTH_LONG).show()
        Log.e("abc","Account OnCreate Called")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
//        Toast.makeText(requireContext(),"Account OnActivityCreated Called", Toast.LENGTH_LONG).show()
        Log.e("abc","Account OnActivityCreated Called")
    }

    override fun onStart() {
        super.onStart()
//        Toast.makeText(requireContext(),"Account OnStart Called", Toast.LENGTH_LONG).show()
        Log.e("abc","Account OnStart Called")
    }

    override fun onResume() {
        super.onResume()
//        Toast.makeText(requireContext(),"Account OnResume Called", Toast.LENGTH_LONG).show()
        Log.e("abc","Account OnResume Called")
    }

    override fun onPause() {
        super.onPause()
//        Toast.makeText(requireContext(),"Account OnPause Called", Toast.LENGTH_LONG).show()
        Log.e("abc","Account OnPause Called")
    }

    override fun onStop() {
        super.onStop()
//        Toast.makeText(requireContext(),"Account OnStop Called", Toast.LENGTH_LONG).show()
        Log.e("abc","Account OnStop Called")
    }

    override fun onDestroyView() {
        super.onDestroyView()
//        Toast.makeText(requireContext(),"Account OnDestroyView Called", Toast.LENGTH_LONG).show()
        Log.e("abc","Account OnDestroyView Called")
    }

    override fun onDestroy() {
        super.onDestroy()
//        Toast.makeText(requireContext(),"Account OnDestroy Called", Toast.LENGTH_LONG).show()
        Log.e("abc","Account OnDestroy Called")
    }

    override fun onDetach() {
        super.onDetach()
//        Toast.makeText(requireContext(),"Account OnDestroy Called", Toast.LENGTH_LONG).show()
        Log.e("abc","Account OnDetach Called")
    }

}