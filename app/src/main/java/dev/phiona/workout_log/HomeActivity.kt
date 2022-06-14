package dev.phiona.workout_log

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    lateinit var bnvHome:BottomNavigationView
    lateinit var fvcHome:FragmentContainerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        castView()
        setupBottom()
    }
    fun castView(){
        bnvHome=findViewById(R.id.bottom_navigation)
        fvcHome=findViewById(R.id.fcvHome)
    }
    fun setupBottom(){
        bnvHome.setOnItemReselectedListener { item->
            when(item.itemId){             // Plan
                R.id.page_1->{
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome,PlanFragment()).commit()
                    true
                }
                R.id.page_3 ->{             //Track
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome,TrackFragment()).commit()
                    true
                }
                R.id.page_1 ->{                //Profile
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome,ProfileFragment()).commit()
                    true
                }
                else -> false
            }


        }
    }
}