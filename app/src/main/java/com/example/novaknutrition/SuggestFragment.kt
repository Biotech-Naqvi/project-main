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
        var level = glucoseLevel.toDouble()
        val foodlist = mutableListOf<String>("Orange Juice", "Pizza Slice", "Cheeseburger", "Meat Ravioli", "Potato Fries", "White Rice", "Hawaiian Rolls", "Horchata", "Hot Dog","Lays Original","Spaghetti","Tortilla Chips", "Brioche Bun", "Hard Boiled Egg","Sourdough Bread", "Honeycrisp Apple", "Whole Milk","2% Fat Milk","Asian Slaw","Peanut Butter","Thai Green Curry","Almond Milk","Seafood Paella","Raw Broccoli","White Cheddar")
        var index1: Int
        var index2: Int
        var index3: Int
        var index4: Int
        var index5: Int


        if(level < 80){
            index1 = (0..17).random()
            index2= -1
            index3= -1
            index4 = -1
            index5 = -1
            while(index2 == index1 || index2 == -1){
                index2 = (0..17).random()
            }
            while(index3 == index2 || index3 == index1 || index3 == -1){
                index3 = (0..17).random()
            }
            while(index4 == index3 || index4 == index2 || index4 == index1 || index4 == -1){
                index4 = (0..17).random()
            }
            while(index5 == index4 || index5 == index3 || index5 == index2 || index5 == index1 ||  index5 == -1){
                index5 = (0..17).random()
            }



            if (suggestionText != null) {
                suggestionText.text = "Your glucose level is excellent. Try eating some of these foods in your next meal: ${foodlist.elementAt(index1)}, ${foodlist.elementAt(index2)}, ${foodlist.elementAt(index3)}, ${foodlist.elementAt(index4)}, ${foodlist.elementAt(index5)}"

            }

        }
        else if(level >= 80 && level < 115){
            index1 = (2..20).random()
            index2= -1
            index3= -1
            index4 = -1
            index5 = -1
            while(index2 == index1 || index2 == -1){
                index2 = (2..20).random()
            }
            while(index3 == index2 || index3 == index1 || index3 == -1){
                index3 = (2..20).random()
            }
            while(index4 == index3 || index4 == index2 || index4 == index1 || index4 == -1){
                index4 = (2..20).random()
            }
            while(index5 == index4 || index5 == index3 || index5 == index2 || index5 == index1 ||  index5 == -1){
                index5 = (2..20).random()
            }
            if (suggestionText != null) {
                suggestionText.text = "Your glucose level is healthy. Try eating some of these foods in your next meal: ${foodlist.elementAt(index1)}, ${foodlist.elementAt(index2)}, ${foodlist.elementAt(index3)}, ${foodlist.elementAt(index4)}, ${foodlist.elementAt(index5)}"
            }
        }
        else if(level >= 115 && level < 150){
            index1 = (3..22).random()
            index2= -1
            index3= -1
            index4 = -1
            index5 = -1
            while(index2 == index1 || index2 == -1){
                index2 = (3..22).random()
            }
            while(index3 == index2 || index3 == index1 || index3 == -1){
                index3 = (3..22).random()
            }
            while(index4 == index3 || index4 == index2 || index4 == index1 || index4 == -1){
                index4 = (3..22).random()
            }
            while(index5 == index4 || index5 == index3 || index5 == index2 || index5 == index1 ||  index5 == -1){
                index5 = (3..22).random()
            }
            if (suggestionText != null) {
                suggestionText.text = "Your glucose level is healthy. Try eating some of these foods in your next meal: ${foodlist.elementAt(index1)}, ${foodlist.elementAt(index2)}, ${foodlist.elementAt(index3)}, ${foodlist.elementAt(index4)}, ${foodlist.elementAt(index5)}"
            }
        }
        else if(level >= 150 && level < 180){
            index1 = (6..24).random()
            index2= -1
            index3= -1
            index4 = -1
            index5 = -1
            while(index2 == index1 || index2 == -1){
                index2 = (6..24).random()
            }
            while(index3 == index2 || index3 == index1 || index3 == -1){
                index3 = (6..24).random()
            }
            while(index4 == index3 || index4 == index2 || index4 == index1 || index4 == -1){
                index4 = (6..24).random()
            }
            while(index5 == index4 || index5 == index3 || index5 == index2 || index5 == index1 ||  index5 == -1){
                index5 = (6..24).random()
            }
            if (suggestionText != null) {
                suggestionText.text = "Your glucose level is healthy. Try eating some of these foods in your next meal: ${foodlist.elementAt(index1)}, ${foodlist.elementAt(index2)}, ${foodlist.elementAt(index3)}, ${foodlist.elementAt(index4)}, ${foodlist.elementAt(index5)}"
            }
        }
        else if(level >= 180 && level < 215){
            index1 = (9..24).random()
            index2= -1
            index3= -1
            index4 = -1
            index5 = -1
            while(index2 == index1 || index2 == -1){
                index2 = (9..24).random()
            }
            while(index3 == index2 || index3 == index1 || index3 == -1){
                index3 = (9..24).random()
            }
            while(index4 == index3 || index4 == index2 || index4 == index1 || index4 == -1){
                index4 = (9..24).random()
            }
            while(index5 == index4 || index5 == index3 || index5 == index2 || index5 == index1 ||  index5 == -1){
                index5 = (9..24).random()
            }
            if (suggestionText != null) {
                suggestionText.text = "Your Glucose level is normal for diabetes. Try eating some of these foods in your next meal to control your blood sugar: ${foodlist.elementAt(index1)}, ${foodlist.elementAt(index2)}, ${foodlist.elementAt(index3)}, ${foodlist.elementAt(index4)}, ${foodlist.elementAt(index5)}"
            }
        }
        else if(level >= 215 && level < 250){
            index1 = (10..24).random()
            index2= -1
            index3= -1
            index4 = -1
            index5 = -1
            while(index2 == index1 || index2 == -1){
                index2 = (10..24).random()
            }
            while(index3 == index2 || index3 == index1 || index3 == -1){
                index3 = (10..24).random()
            }
            while(index4 == index3 || index4 == index2 || index4 == index1 || index4 == -1){
                index4 = (10..24).random()
            }
            while(index5 == index4 || index5 == index3 || index5 == index2 || index5 == index1 ||  index5 == -1){
                index5 = (10..24).random()
            }
            if (suggestionText != null) {
                suggestionText.text = "Your Glucose level is normal for diabetes. Try eating some of these foods in your next meal to control your blood sugar: ${foodlist.elementAt(index1)}, ${foodlist.elementAt(index2)}, ${foodlist.elementAt(index3)}, ${foodlist.elementAt(index4)}, ${foodlist.elementAt(index5)}"
            }
        }
        else if(level >= 250 && level < 280){
            index1 = (12..24).random()
            index2= -1
            index3= -1
            index4 = -1
            index5 = -1
            while(index2 == index1 || index2 == -1){
                index2 = (12..24).random()
            }
            while(index3 == index2 || index3 == index1 || index3 == -1){
                index3 = (12..24).random()
            }
            while(index4 == index3 || index4 == index2 || index4 == index1 || index4 == -1){
                index4 = (12..24).random()
            }
            while(index5 == index4 || index5 == index3 || index5 == index2 || index5 == index1 ||  index5 == -1){
                index5 = (12..24).random()
            }
            if (suggestionText != null) {
                suggestionText.text = "Your Glucose level is high. Try eating some of these foods in your next meal to lower your blood sugar: ${foodlist.elementAt(index1)}, ${foodlist.elementAt(index2)}, ${foodlist.elementAt(index3)}, ${foodlist.elementAt(index4)}, ${foodlist.elementAt(index5)}"
            }
        }
        else if(level >= 280 && level < 315){
            index1 = (15..24).random()
            index2= -1
            index3= -1
            index4 = -1
            index5 = -1
            while(index2 == index1 || index2 == -1){
                index2 = (15..24).random()
            }
            while(index3 == index2 || index3 == index1 || index3 == -1){
                index3 = (15..24).random()
            }
            while(index4 == index3 || index4 == index2 || index4 == index1 || index4 == -1){
                index4 = (15..24).random()
            }
            while(index5 == index4 || index5 == index3 || index5 == index2 || index5 == index1 ||  index5 == -1){
                index5 = (15..24).random()
            }
            if (suggestionText != null) {
                suggestionText.text = "Your Glucose level is high. Try eating some of these foods in your next meal to lower your blood sugar: ${foodlist.elementAt(index1)}, ${foodlist.elementAt(index2)}, ${foodlist.elementAt(index3)}, ${foodlist.elementAt(index4)}, ${foodlist.elementAt(index5)}. You should also take a ketonetes test."
            }
        }
        else if(level >= 315){
            index1 = (17..24).random()
            index2= -1
            index3= -1
            index4 = -1
            index5 = -1
            while(index2 == index1 || index2 == -1){
                index2 = (17..24).random()
            }
            while(index3 == index2 || index3 == index1 || index3 == -1){
                index3 = (17..24).random()
            }
            while(index4 == index3 || index4 == index2 || index4 == index1 || index4 == -1){
                index4 = (17..24).random()
            }
            while(index5 == index4 || index5 == index3 || index5 == index2 || index5 == index1 ||  index5 == -1){
                index5 = (17..24).random()
            }
            if (suggestionText != null) {
                suggestionText.text = "Your Glucose level is very high. Try eating some of these foods in your next meal to lower your blood sugar: ${foodlist.elementAt(index1)}, ${foodlist.elementAt(index2)}, ${foodlist.elementAt(index3)}, ${foodlist.elementAt(index4)}, ${foodlist.elementAt(index5)}. You should also take a ketonetes test."
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
