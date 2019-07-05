package org.firehound.solarmonitor.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
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
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, InfoFragment()).commit()
        bottomNavigationView.setOnNavigationItemSelectedListener {
            var fragment: Fragment = InfoFragment()
            var retVal = false
            when (it.itemId) {
                R.id.menuSiteInfo -> {
                    fragment = InfoFragment()
                    retVal = true
                }
                R.id.menuVisualize -> {
                    fragment = GraphFragment()
                    retVal = true
                }
                R.id.menuStats -> {
                    fragment = StatsFragment()
                    retVal = true
                }
            }
            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment, fragment.javaClass.simpleName).commit()
            retVal
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("frag", bottomNavigationView.selectedItemId)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        var fragment: Fragment = InfoFragment()
        when (savedInstanceState.getInt("frag")) {
            R.id.menuSiteInfo -> {
                fragment = InfoFragment()
            }
            R.id.menuVisualize -> {
                fragment = GraphFragment()
            }
            R.id.menuStats -> {
                fragment = StatsFragment()
            }
        }
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment, fragment.javaClass.simpleName).commit()
    }
}
