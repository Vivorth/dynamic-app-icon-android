package com.example.dynamic_app_icon

import android.content.ComponentName
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dynamic_app_icon.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.firstBtn.setOnClickListener {
            packageManager.setComponentEnabledSetting(ComponentName(this@MainActivity, "com.example.dynamic_app_icon.SecondLauncherAlias"), PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP)
            packageManager.setComponentEnabledSetting(ComponentName(this@MainActivity, "com.example.dynamic_app_icon.FirstLauncherAlias"), PackageManager.COMPONENT_ENABLED_STATE_ENABLED,PackageManager.DONT_KILL_APP)

        }
        binding.secondBtn.setOnClickListener {
            packageManager.setComponentEnabledSetting(ComponentName(this@MainActivity, "com.example.dynamic_app_icon.FirstLauncherAlias"), PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP)
            packageManager.setComponentEnabledSetting(ComponentName(this@MainActivity, "com.example.dynamic_app_icon.SecondLauncherAlias"), PackageManager.COMPONENT_ENABLED_STATE_ENABLED,PackageManager.DONT_KILL_APP)

        }

    }
}