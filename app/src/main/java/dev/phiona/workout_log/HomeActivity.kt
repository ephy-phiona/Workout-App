package dev.phiona.workout_log

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import dev.phiona.workout_log.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
   lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        castView()
        setupBottom()
    }
    fun castView(){
//        bnvHome=findViewById(R.id.bottom_navigation)
//        fvcHome=findViewById(R.id.fcvHome)
    }
    fun setupBottom(){
       binding.bottomNavigation.setOnItemReselectedListener { item->
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