package ucb.edu.bo.bottomnavigationview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var principal_bottom_navigation_view:BottomNavigationView=findViewById(R.id.principal_bottom_navigation_view)
        principal_bottom_navigation_view.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.home_bottom_navigation_menu -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.principal_frame_layout, HomeFragment())
                        .commit()
                    true
                }
                R.id.profile_bottom_navigation_menu -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.principal_frame_layout, ProfileFragment())
                        .commit()
                    true
                }
                else -> true
            }
        }


    }
}