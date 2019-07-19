package com.example.navcomponents.home


import android.os.Bundle
import android.view.Menu
import com.example.navcomponents.BaseActivity
import com.example.navcomponents.R

/**
 * Home screen
 *
 * Created by bernatgomez on July,2019
 */
class HomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        this.layout = R.layout.activity_home

        super.onCreate(savedInstanceState)
    }

    override fun getNavContainerID() = R.id.home_nav_container

    override fun getDrawerID() = R.id.home_drawer
}
