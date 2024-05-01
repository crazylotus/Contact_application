package com.example.contact

import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.view.View
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.contact.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout


class MainActivity :CommonActivity(){
    lateinit var binding : ActivityMainBinding
    lateinit var navHostFragment : NavHostFragment
    lateinit var navController : NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController = navHostFragment.navController
        binding.bottomNavigationView.background = null

        val bundle: Bundle? = intent.extras
        val page = bundle?.getString("randomContact").toString()

        val extras = Bundle()
        extras.putString("randomContact", page)

        navController.setGraph(R.navigation.nav_graph, extras)
        binding.bottomNavigationView.setupWithNavController(navController)
        binding.bottomNavigationView.setOnItemReselectedListener { /* NO-OP */ }
        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.randromContactFragment,
                R.id.phoneContackFragment,
                -> {
                    binding.bottomAppBar.visibility = View.VISIBLE

                }

                else -> {
                    binding.bottomAppBar.visibility = View.GONE

                }
            }

        }
    }
}