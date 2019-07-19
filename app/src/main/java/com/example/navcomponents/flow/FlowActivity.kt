package com.example.navcomponents.flow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.onNavDestinationSelected
import androidx.navigation.ui.setupWithNavController
import com.example.navcomponents.R
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.part_navigation.*
import kotlinx.android.synthetic.main.part_toolbar.*

class FlowActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_flow)

        this.hookDrawer()

        this.hookToolbar()
    }

    private fun getNavController() = this.findNavController(R.id.flow_nav_container)

    private fun hookDrawer() {
        this.navigation?.setupWithNavController(navController = getNavController())
    }

    private fun hookToolbar() {
        val config = AppBarConfiguration(
            setOf(R.id.home_dest, R.id.flow_step_1_dest),
            this.home_drawer,
            fallbackOnNavigateUpListener = { this.getNavController().navigateUp()}
        )

        this.main_toolbar.setupWithNavController(this.getNavController(), config)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return item!!.onNavDestinationSelected(this.getNavController())
    }
}
