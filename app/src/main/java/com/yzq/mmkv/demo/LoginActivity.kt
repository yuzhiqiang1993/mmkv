package com.yzq.mmkv.demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yzq.mmkv.demo.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        MMKVDefault.appFirstOpen = false
        binding.etAccount.setText(MMKVUser.account)
        binding.etPwd.setText(MMKVUser.pwd)
        MMKVUser.hasLogin = true

        binding.btnLogin.setOnClickListener {
            MMKVUser.account = binding.etAccount.text.toString()
            MMKVUser.pwd = binding.etPwd.text.toString()

            MainActivity.start(this)
        }
    }
}