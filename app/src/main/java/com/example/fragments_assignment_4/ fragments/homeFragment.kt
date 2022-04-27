package com.example.fragments_assignment_4.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.fragments_assignment_4.R

class homeFragment : Fragment(R.layout.fragments_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<Button>(R.id.button)
        val  amountText = view.findViewById<EditText>(R.id.editTextNumber)

        button.setOnClickListener{

            val  amount = amountText.text.toString().toInt()

            val action = homeFragmentDirections.actionHomeFragment2ToDashboardFragment2(amount)

            findNavController().navigate(action)
        }
    }
}