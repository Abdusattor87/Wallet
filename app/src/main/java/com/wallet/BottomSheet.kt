package com.wallet



import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottomSheet : BottomSheetDialogFragment() {


    private lateinit var   radioButton1: RadioButton
    private lateinit var   LinearLayout2: LinearLayout
    private lateinit var   radioButton2: RadioButton
    private lateinit var   LinearLayout1: LinearLayout


    private lateinit var   LinearLayout3: LinearLayout
    private lateinit var   radioButton3: RadioButton
    private lateinit var   ButtonAddCard: ImageView




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        LinearLayout1 = view.findViewById<LinearLayout>(R.id.LinearLayout1)
        radioButton1 = view.findViewById<RadioButton>(R.id.radioButton1)

        radioButton2 = view.findViewById<RadioButton>(R.id.radioButton2)
        LinearLayout2 = view.findViewById<LinearLayout>(R.id.LinearLayout2)

        radioButton3 = view.findViewById<RadioButton>(R.id.radioButton3)
        LinearLayout3 = view.findViewById<LinearLayout>(R.id.LinearLayout3)

        LinearLayout1.setOnClickListener {onButtonClick(it)}
        radioButton1.setOnClickListener {onButtonClick(it)}

        LinearLayout2.setOnClickListener {onButtonClick1(it)}
        radioButton2.setOnClickListener {onButtonClick1(it)}


        LinearLayout3.setOnClickListener {onButtonClick2(it)}
        radioButton3.setOnClickListener {onButtonClick2(it)}




//        ButtonAddCard = view.findViewById<ImageView>(R.id.ButtonAddCard)
//
//        //Здесь мы добавление нового элемента в адаптер и обновление ViewPager2
//        ButtonAddCard.setOnClickListener {
//
//
//
//        }



    }





    private  fun onButtonClick(view: View) {
        radioButton1.isChecked = true
        radioButton2.isChecked = false
        radioButton3.isChecked = false
    }
    private  fun onButtonClick1(view: View) {
        radioButton1.isChecked = false
        radioButton2.isChecked = true
        radioButton3.isChecked = false
    }

    private  fun onButtonClick2(view: View) {
        radioButton1.isChecked = false
        radioButton2.isChecked = false
        radioButton3.isChecked = true
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.bottom_sheet_layout, container, false)

    }

}


