package com.example.navcomponents.settings


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.navcomponents.BaseActivity
import com.example.navcomponents.R
import kotlinx.android.synthetic.main.part_navigation.*
import kotlinx.android.synthetic.main.part_toolbar.*

/**
 * Settings screen
 *
 * Created by bernatgomez on July,2019
 */
class SettingsActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        this.layout = R.layout.activity_settings

        super.onCreate(savedInstanceState)
    }

    override fun getDrawerID() = R.id.settings_drawer

    override fun getNavContainerID() = R.id.settings_nav_container
}
