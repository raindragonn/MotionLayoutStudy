package com.raindragonn.motionlayouttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.raindragonn.motionlayouttest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .replace(binding.fragmentMusicContainer.id, PlayerFragment())
            .commit()

        binding.btnShowToast.setOnClickListener {
            Toast.makeText(this, "눌림", Toast.LENGTH_SHORT).show()
        }
    }

}