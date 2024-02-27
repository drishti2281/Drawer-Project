package com.example.drawproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import com.example.drawproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var actionBarDrawerToogle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        actionBarDrawerToogle= ActionBarDrawerToggle(this,binding.drawerActivity,binding.toolbar,R.string.open_drawer,R.string.Close_drawer)
        binding.drawerActivity.addDrawerListener(actionBarDrawerToogle)
        actionBarDrawerToogle.syncState()
        binding.sideNav.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.sideMenuProfile->{
                    Toast.makeText(this,"This is home",Toast.LENGTH_SHORT).show()
                }
                R.id.sideMenuUpload->{
                    Toast.makeText(this,"This is upload",Toast.LENGTH_SHORT).show()
                }
                R.id.sideMenuEdit->{
                Toast.makeText(this,"This is Edit",Toast.LENGTH_SHORT).show()
                }
                R.id.sideMenuDelete->{
                    Toast.makeText(this,"This is delete",Toast.LENGTH_SHORT).show()
                }
                R.id.sideMenuReceive->{
                    Toast.makeText(this,"This is Receive",Toast.LENGTH_SHORT).show()
                }
                R.id.sideMenuUnpaid->{
                    Toast.makeText(this,"This is unpaid",Toast.LENGTH_SHORT).show()
                }
                R.id.sideMenuHistory->{
                    Toast.makeText(this,"This is hitory",Toast.LENGTH_SHORT).show()
                }
            }
            binding.drawerActivity.closeDrawers()
            return@setNavigationItemSelectedListener true
        }
    }
}
