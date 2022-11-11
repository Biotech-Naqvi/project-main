package com.example.novaknutrition
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs



class FirstFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val suggestButton: Button = view.findViewById(R.id.suggestButton)

        suggestButton.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.FirstToSuggest)
        }
        val selectButton: Button = view.findViewById(R.id.SelectButton)

        selectButton.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.FirstToSelect)
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }



}