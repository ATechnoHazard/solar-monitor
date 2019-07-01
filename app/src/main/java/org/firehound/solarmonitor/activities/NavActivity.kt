package org.firehound.solarmonitor.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_nav.*
import org.firehound.solarmonitor.R
import org.firehound.solarmonitor.fragments.GraphFragment
import org.firehound.solarmonitor.fragments.InfoFragment
import org.firehound.solarmonitor.fragments.StatsFragment

class NavActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nav)
        bottomNavigationView.setOnNavigationItemSelectedListener(BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.menuSiteInfo -> {
                    val fragment = InfoFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment, fragment.javaClass.simpleName).commit()
                    return@OnNavigationItemSelectedListener true
                }
                R.id.menuVisualize -> {
                    val fragment = GraphFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment, fragment.javaClass.simpleName).commit()
                    return@OnNavigationItemSelectedListener true
                }
                R.id.menuStats -> {
                    val fragment = StatsFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment, fragment.javaClass.simpleName).commit()
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        })
        val fragment = InfoFragment()
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment, fragment.javaClass.simpleName).commit()
    }
}
