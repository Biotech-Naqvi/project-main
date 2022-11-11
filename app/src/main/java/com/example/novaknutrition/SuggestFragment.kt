package com.example.novaknutrition

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.navigation.findNavController


class SuggestFragment : Fragment() {



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val HomeFromSuggestButton: Button = view.findViewById(R.id.SuggestHome)
        HomeFromSuggestButton.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.SuggestToFirst)
        }
            val calculateButton: Button = view.findViewById(R.id.calculate)
            calculateButton.setOnClickListener{
                calculate()
            }



    }

    fun calculate() {

        var suggestionText : TextView? = view?.findViewById(R.id.SuggestionText)
        var suggestion: Int = 0
        val glucoseText = view?.findViewById<EditText>(R.id.glucose)
        var glucoseLevel = glucoseText?.text.toString()
        var level = glucoseLevel.toInt()
        if(level < 80){
            if (suggestionText != null) {
                suggestionText.text = "Your glucose level is excellent and you don't need to take action to control it. Try eating some of these foods in your next meal: cheeseburger, brioche bun, meat ravioli, Thai Green Curry, Sourdough Bread"

            }

        }
        else if(level >= 80 && level < 115){
            if (suggestionText != null) {
                suggestionText.text = "Your glucose level is healthy. Try eating some of these foods in your next meal: Spaghetti, Pizza, Asian Slaw, Orange Juice, Hawaiian Rolls, Hard Boiled Egg"
            }
        }
        else if(level >= 115 && level < 150){
            if (suggestionText != null) {
                suggestionText.text = "Your glucose level is healthy. Try eating some of these foods in your next meal: Hot Dog, White rice, Original Lays, Raw Brocolli, Almond Milk, Honeycrisp Apple"
            }
        }
        else if(level >= 150 && level < 180){
            if (suggestionText != null) {
                suggestionText.text = "Your glucose level is healthy. Try eating some of these foods in your next meal: Horchata, Brioche Bun, Tortilla chips, Asian slaw, whole milk, white rice, Peanut butter"
            }
        }
        else if(level >= 180 && level < 215){
            if (suggestionText != null) {
                suggestionText.text = "Your Glucose level is normal for diabetes. Try eating some of these foods in your next meal to control your blood sugar: Sourhdough Bread, Orange Juice, Tortilla chips, White Cheddar, Almond Milk, Original Lays, Safeood Paella"
            }
        }
        else if(level >= 215 && level < 250){
            if (suggestionText != null) {
                suggestionText.text = "Your Glucose level is normal for diabetes. Try eating some of these foods in your next meal to control your blood sugar: Hard Boiled Egg, Brioche Bun, Asian slaw, Raw broccoli, 2% fat milk, Hawaiian Rolls"
            }
        }
        else if(level >= 250 && level < 280){
            if (suggestionText != null) {
                suggestionText.text = "Your Glucose level is high. Try eating some of these foods in your next meal to lower your blood sugar: Tortilla Chips, Honeycrisp apple, whole milk, white cheddar, raw broccoli, orange juice, peanut butter"
            }
        }
        else if(level >= 280 && level < 315){
            if (suggestionText != null) {
                suggestionText.text = "Your Glucose level is high. Try eating some of these foods in your next meal to lower your blood sugar: Honeycrisp apple, hawaiian rolls, Asian slaw, almond milk, original lays, Tortilla chips"
            }
        }
        else if(level >= 315){
            if (suggestionText != null) {
                suggestionText.text = "Your Glucose level is very high. Try eating some of these foods in your next meal to lower your blood sugar: Original lays, orange juice, asian slaw, whole milk, raw broccoli, white cheddar"
            }
        }



    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_suggest, container, false)
    }


}