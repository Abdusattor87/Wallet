package com.wallet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import androidx.fragment.app.Fragment



class CardFragment : Fragment() {
    companion object {
        fun newInstance(item: CardItem): CardFragment {
            val fragment = CardFragment()


            val args = Bundle()
            args.putString("data", item.account)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_card, container, false)




        val data = arguments?.getString("data", "")

        val textView = view.findViewById<TextView>(R.id.textView)
        textView.text = data
        return view
    }
}
