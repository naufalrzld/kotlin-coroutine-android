package com.belajar.coroutine

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.belajar.coroutine.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var remoteDataSource: RemoteDataSource

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        remoteDataSource = RemoteDataSource()

        var result = ""
        binding.btnGetList.setOnClickListener {
            /**
             * TODO: Buat coroutine dengan scope lifecycleScope,
             *  kemudian panggil suspend function fetchListOfStringFromAPI()
             *  dari RemoteDataSource. Simpan hasilnya ke dalam variable result
             *  dan tampilkan value result ke tvResult.
             *
             * HINT: Gunakan fungsi joinToString(", ") untuk menggabungkan isi dari listOf<String>
             *     menjadi sebuah string utuh.
             **/
        }

        binding.btnGetString.setOnClickListener {
            /**
             * TODO: Buat coroutine dengan scope lifecycleScope,
             *  kemudian panggil suspend function fetchStringFromAPI()
             *  dari RemoteDataSource. Simpan hasilnya ke dalam variable result
             *  dan tampilkan value result ke tvResult.
             **/
        }
    }
}