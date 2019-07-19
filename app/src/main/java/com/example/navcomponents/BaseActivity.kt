package com.example.navcomponents


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.onNavDestinationSelected
import androidx.navigation.ui.setupWithNavController
import com.example.navcomponents.help.HelpActivity
import kotlinx.android.synthetic.main.part_navigation.*
import kotlinx.android.synthetic.main.part_toolbar.*


/**
 * Base UI controller
 *
 * Created by bernatgomez on July,2019
 */
abstract class BaseActivity : AppCompatActivity() {
    protected var layout : Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        this.setContentView(this.layout)

        this.hookPrimaryNavigation()

        this.hookToolbar()
    }

    private fun hookPrimaryNavigation() {
        this.app_navigation?.setupWithNavController(navController = this.getNavController())
    }

    private fun hookToolbar() {
        val config = AppBarConfiguration(
            //XXX: screens on which we show burguer icon
            setOf(R.id.home_dest, R.id.flow_step_1_dest, R.id.settings_dest),
            this.getDrawerLayout(),
            //XXX: behavior for up navigation
            fallbackOnNavigateUpListener = { this.getNavController().navigateUp()}
        )

        this.app_toolbar.setupWithNavController(this.getNavController(), config)
    }

    private fun getDrawerLayout() = this.findViewById<DrawerLayout>(this.getDrawerID())?: null

    protected fun getNavController() = this.findNavController(this.getNavContainerID())

    abstract fun getNavContainerID() : Int

    abstract fun getDrawerID() : Int

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        this.menuInflater.inflate(R.menu.popup_menu, menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        item!!.onNavDestinationSelected(this.getNavController())
        return true
    }
}
