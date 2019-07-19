package com.example.navcomponents.flow


import android.os.Bundle
import android.view.MenuItem
import androidx.navigation.ui.onNavDestinationSelected
import com.example.navcomponents.BaseActivity
import com.example.navcomponents.R


/**
 * Sample flow screen
 *
 * Created by bernatgomez on July,2019
 */
class FlowActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        this.layout = R.layout.activity_flow

        super.onCreate(savedInstanceState)
    }

    override fun getNavContainerID() = R.id.flow_nav_container

    override fun getDrawerID() = R.id.flow_drawer
}
