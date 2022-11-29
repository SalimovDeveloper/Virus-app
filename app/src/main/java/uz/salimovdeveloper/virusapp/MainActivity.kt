package uz.salimovdeveloper.virusapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import uz.salimovdeveloper.virusapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        handler = Handler(Looper.getMainLooper())
        handler.postDelayed(runnable, 100)

    }

    private val runnable = object  : Runnable{
        override fun run() {
            handler.postDelayed(this, 100)
            finish()
            startActivity(Intent(this@MainActivity, MainActivity::class.java))
        }
    }
}