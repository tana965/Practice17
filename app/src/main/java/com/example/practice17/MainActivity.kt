package com.example.practice17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.view.menu.MenuView
import android.graphics.drawable.Icon
import android.view.View


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_Practice17)
        setContentView(R.layout.activity_main)
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)


        val icon: MenuItem = menu?.findItem(R.id.icon_menu_item)!!
        val menuInfo = menu.findItem(R.id.theme_menu)

        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            menuInfo.setTitle("Сменить на светлую")
            icon.setIcon(android.R.drawable.alert_dark_frame)
            title = "Темно"
        } else {
            menuInfo.setTitle("Сменить на тёмную")
            icon.setIcon(android.R.drawable.alert_light_frame)
            title = "Светло"
        }

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean{
        when(item.itemId){
            R.id.theme_menu -> title = "Сменить на тёмную"
            R.id.about_menu -> title = "О программе"  }
        return super.onOptionsItemSelected(item)
    }

    fun themeClick(item: MenuItem) {
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {

            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }
        else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        }
        }

        fun aboutClick(item: MenuItem) {
            val intent: Intent = Intent(this@MainActivity, AboutActivity::class.java)
            startActivity(intent)
        }




}