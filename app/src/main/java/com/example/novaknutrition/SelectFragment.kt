package com.example.novaknutrition

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController

class SelectFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val HomeFromSelectButton: Button = view.findViewById(R.id.SelectHome)
        HomeFromSelectButton.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.SelectToFirst)
        }
        val FatMilk2: Button = view.findViewById(R.id.Milk2)

        FatMilk2.setOnClickListener{
            findNavController().navigate(R.id.SelectToDetails, Bundle().apply {
                putString("food", "2 Percent Fat Milk: Serving Size = 1 cup,   11.98 carbs, 8.17g protein, 4.64 total fat, 0g fiber, 95.16mg sodium, 11.93g sugar, 122 Calories. Novak Rating 7/10")
            })
        }
        val AlmondMilk: Button = view.findViewById(R.id.AlmondMilk)
        AlmondMilk.setOnClickListener{
            findNavController().navigate(R.id.SelectToDetails, Bundle().apply {
                putString("food", "Almond Milk: Serving Size = 1 cup    8g carbs, 1g protein, 2.5g total fat, 0.3g fiber, 150mg sodium, 7g sugar, 149 Calories, Novak Rating 8/10")
            })
        }
        val AsianSlaw:Button = view.findViewById(R.id.AsianSlaw)
        AsianSlaw.setOnClickListener{
            findNavController().navigate(R.id.SelectToDetails, Bundle().apply {
                putString("food", "Asian Slaw With Dressing: Serving Size = 100g    20g carbs, 4g protein, 6g total fat, 5g fiber, 560mg sodium, 4g sugar, 116 Calories, Novak Rating 7/10")

            })
        }
        val BriocheBun:Button = view.findViewById(R.id.BriocheBun)
        BriocheBun.setOnClickListener{
            findNavController().navigate(R.id.SelectToDetails, Bundle().apply {
                putString("food", "Brioche Bun: Serving Size = 1 bun    32g carbs, 5g protien, 2.5g total fat, 2g fiber, 310mg sodium, 6g sugar, 170 Calories, Novak Rating 5/10")

            })
        }
        val CheeseBurger:Button = view.findViewById(R.id.ChesseBurger)
        CheeseBurger.setOnClickListener{
            findNavController().navigate(R.id.SelectToDetails, Bundle().apply {
                putString("food", "Cheeseburger: Serving Size = 103g    35g carbs, 17g protein, 14 grams total fat, 1.95g fiber, 630mg sodium, 6.01g sugar, 350 Calories, Novak Rating 1/10")

            })
        }
        val HardEgg:Button = view.findViewById(R.id.HardEgg)
        HardEgg.setOnClickListener{
            findNavController().navigate(R.id.SelectToDetails, Bundle().apply {
                putString("food", "Hard Boiled Egg: Serving Size = 1.8oz    0.6g carbs, 6.3g protein, 5.3 grams total fat, 0g fiber, 62mg sodium, 0.6g sugar, 77 Calories, Novak Rating 5/10")

            })
        }
        val Hawaiian:Button = view.findViewById(R.id.HawaiianRoles)
        Hawaiian.setOnClickListener{
            findNavController().navigate(R.id.SelectToDetails, Bundle().apply {
                putString("food", "Hawaiian Rolls: Serving Size = 1 Roll    16g carbs, 0g protein, 7 grams total fat, 0g fiber, 80g sodium, 8g sugar, 90 Calories, Novak Rating 6/10")

            })
        }
        val HoneyApple:Button = view.findViewById(R.id.HoneyAppl)
        HoneyApple.setOnClickListener{
            findNavController().navigate(R.id.SelectToDetails, Bundle().apply {
                putString("food", "Honeycrisp Apple: Serving Size = 5.4 fl oz    22g carbs, 0 protein, 0 grams total fat, 5 fiber, 0mg sodium, 16 sugar, 80 Calories, Novak Rating 6/10")

            })
        }
        val Horchata:Button = view.findViewById(R.id.Horchata)
        Horchata.setOnClickListener{
            findNavController().navigate(R.id.SelectToDetails, Bundle().apply {
                putString("food", "Horchata: Serving Size = 1 cup    26g carbs, 3g protein, 3g grams total fat, 0g fiber, 45mg sodium, 24g sugar, 140 Calories, Novak Rating 4/10")

            })
        }
        val HotDog:Button = view.findViewById(R.id.HotDog)
        HotDog.setOnClickListener{
            findNavController().navigate(R.id.SelectToDetails, Bundle().apply {
                putString("food", "Hot Dog: Serving Size = 102g    13g carbs, 9g protein, 18.6 grams total fat, 0.8g fiber, 810mg sodium, 4g sugar, 314 Calories, Novak Rating 4/10")

            })
        }
        val MeatRavi:Button = view.findViewById(R.id.MeatRavioli)
        MeatRavi.setOnClickListener{
            findNavController().navigate(R.id.SelectToDetails, Bundle().apply {
                putString("food", "Meat Ravioli: Serving Size = 1 cup    35.73 carbs, 21.82 protein, 15.55 grams total fat, 2.5g fiber, 1490mg sodium, 4.5 sugar, 373 Calories, Novak Rating 3/10")

            })
        }
        val OJ:Button = view.findViewById(R.id.OrangeJuice)
        OJ.setOnClickListener{
            findNavController().navigate(R.id.SelectToDetails, Bundle().apply {
                putString("food", "Orange Juice: Serving Size = 2.8 fl oz    8.9g carbs, 0.6g protein, 0.2 grams total fat, 0.2g fiber, 0mg sodium, 7.2g sugar, 39 Calories, Novak Rating 1/10")

            })
        }
        val OL:Button = view.findViewById(R.id.OriginalLays)
        OL.setOnClickListener{
            findNavController().navigate(R.id.SelectToDetails, Bundle().apply {
                putString("food", "Lays Original: Serving Size = 15 chips    15g carbs, 2g protein, 10g grams total fat, 1g fiber, 170mg sodium, 0.5g sugar, 160 Calories, Novak Rating 4/10")

            })
        }
        val PB:Button = view.findViewById(R.id.PeanutButter)
        PB.setOnClickListener{
            findNavController().navigate(R.id.SelectToDetails, Bundle().apply {
                putString("food", "Peanut Butter: Serving Size = 32g    8g carbs, 7g protein, 16 grams total fat, 2g fiber, 136mg sodium, 3g sugar, 190 Calories, Novak Rating 7/10")

            })
        }
        val PS:Button = view.findViewById(R.id.PizzaSlice)
        PS.setOnClickListener{
            findNavController().navigate(R.id.SelectToDetails, Bundle().apply {
                putString("food", "Pizza Slice: Serving Size = 107g    35.6g carbs, 12.2g protein, 10.4 grams total fat, 2.5g fiber, 640mg sodium, 3.8g sugar, 285 Calories, Novak Rating 2/10")

            })
        }
        val PF:Button = view.findViewById(R.id.PotatoFries)
        PF.setOnClickListener{
            findNavController().navigate(R.id.SelectToDetails, Bundle().apply {
                putString("food", "Potato Fries: Serving Size = 3 oz    32.7g carbs, 3.2 protein, 13.7 grams total fat, 4.4 fiber, 247mg sodium, 0.6g sugar, 267 Calories, Novak Rating 3/10")

            })
        }
        val RB:Button = view.findViewById(R.id.RawBroccoli)
        RB.setOnClickListener{
            findNavController().navigate(R.id.SelectToDetails, Bundle().apply {
                putString("food", "Broccoli: Serving Size = 3.1oz    5.8 carbs, 2.5g protein, 0.3 grams total fat, 2.3 fiber, 29mg sodium, 1.5g sugar, 30 Calories, Novak Rating 10/10")

            })
        }
        val Sea:Button = view.findViewById(R.id.SeafoodPaella)
        Sea.setOnClickListener{
            findNavController().navigate(R.id.SelectToDetails, Bundle().apply {
                putString("food", "Seafood Paella: Serving Size = 200g    37g carbs, 12g protein, 9 grams total fat, 2.3g fiber, 315mg sodium, 2.5g sugar, 215 Calories, Novak Rating 8/10")

            })
        }
        val SBread:Button = view.findViewById(R.id.SourdoughBread)
        SBread.setOnClickListener{
            findNavController().navigate(R.id.SelectToDetails, Bundle().apply {
                putString("food", "Sourdough Bread: Serving Size = 2 inch slice   18.1 carbs, 3.8g protein, 0.6 grams total fat, 0.8 fiber, 208mg sodium, 0.8 sugar, 92 Calories, Novak Rating 3/10")

            })
        }
        val Spaghetti:Button = view.findViewById(R.id.Spaghetti)
        Spaghetti.setOnClickListener{
            findNavController().navigate(R.id.SelectToDetails, Bundle().apply {
                putString("food", "Plain Spaghetti: Serving Size = 3.7oz    41.1g carbs, 7.8g protein, 1.2g grams total fat, 2.4g fiber, 1mg sodium, 0.8 sugar, 212 Calories, Novak Rating 4/10")

            })
        }
        val TGC:Button = view.findViewById(R.id.ThaiGreen)
        TGC.setOnClickListener{
            findNavController().navigate(R.id.SelectToDetails, Bundle().apply {
                putString("food", "Thai Green Curry: Serving Size = 400g    56g carbs, 20g protein, 13 grams total fat, 0g fiber, 780mg sodium, 3.5g sugar, 434 Calories, Novak Rating 7/10")

            })
        }
        val TChips:Button = view.findViewById(R.id.TortillaChip)
        TChips.setOnClickListener{
            findNavController().navigate(R.id.SelectToDetails, Bundle().apply {
                putString("food", "Tortilla Chips: Serving Size = 10 chips    12g carbs, 0.2g protein, 1 grams total fat, 0.1g fiber, 7mg sodium, 0g sugar, 12 Calories, Novak Rating 4/10")

            })

        }
        val WhiteCheddar:Button = view.findViewById(R.id.WhiteCheddar)
        WhiteCheddar.setOnClickListener{
            findNavController().navigate(R.id.SelectToDetails, Bundle().apply {
                putString("food", "White Cheddar: Serving Size = 28g    0g carbs, 6g protein, 10g grams total fat, 0g fiber, 170mg sodium, 0g sugar, 120 Calories, Novak Rating 10/10")

            })
        }
        val WhiteRice:Button = view.findViewById(R.id.WhiteRice)
        WhiteRice.setOnClickListener{
            findNavController().navigate(R.id.SelectToDetails, Bundle().apply {
                putString("food", "White Rice: Serving Size = 5.6oz    44.5g carbs, 4.3 protein, 0.4 grams total fat, 0.6g fiber, 2mg sodium, 0 sugar, 205 Calories, Novak Rating 3/10")

            })
        }
        val WholeMilk:Button = view.findViewById(R.id.WholeMilk)
        WholeMilk.setOnClickListener{
            findNavController().navigate(R.id.SelectToDetails, Bundle().apply {
                putString("food", "Whole Milk: Serving Size = 8fl oz    12.8g carbs, 7.9g protein, 8 grams total fat, 0 fiber, 98mg sodium, 12.8g sugar, 146 Calories, Novak Rating 6/10")

            })
        }







    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_select, container, false)
    }


}