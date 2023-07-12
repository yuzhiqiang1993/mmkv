package com.yzq.mmkv.demo

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yzq.mmkv.demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        MMKVDefault.user = User(1, "yzq", 20)

        binding.tvUser.text = MMKVDefault.user.toString()

    }

    companion object {
        fun start(context: Context) {
            Intent(context, MainActivity::class.java).run {
                context.startActivity(this)
            }
        }
    }
}