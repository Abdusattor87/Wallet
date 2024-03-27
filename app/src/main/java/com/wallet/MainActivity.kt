package com.wallet


import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatDelegate
import androidx.viewpager2.widget.ViewPager2


class MainActivity : AppCompatActivity() {

//
//    private lateinit var viewPager: ViewPager2
//    private lateinit var cardViewPagerAdapter: CardViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide() //выключаем ActionBar







//    Здесь мы меням режим
        val DarkModeButton = findViewById<ImageView>(R.id.DarkModeButton)
        DarkModeButton.setOnClickListener {
             val currentTheme = resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK
            if (currentTheme == Configuration.UI_MODE_NIGHT_NO) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }


//Здес мы открываем боттом шит
        val AddCardButton = findViewById<ImageView>(R.id.AddCardButton)
        AddCardButton.setOnClickListener {
            val bottomSheet = BottomSheet()
            bottomSheet.show(supportFragmentManager, bottomSheet.tag)

        }



    }
}