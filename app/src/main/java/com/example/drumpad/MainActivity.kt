package com.example.drumpad

import android.graphics.Color
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(applicationContext, "Click anywhere inside the app", Toast.LENGTH_LONG)
            .show()

        val mediaPlayer0: MediaPlayer = MediaPlayer.create(applicationContext, R.raw.sound00)
        val mediaPlayer1: MediaPlayer = MediaPlayer.create(applicationContext, R.raw.sound1)
        val mediaPlayer2: MediaPlayer = MediaPlayer.create(applicationContext, R.raw.sound2)
        val mediaPlayer3: MediaPlayer = MediaPlayer.create(applicationContext, R.raw.sound3)
        val mediaPlayer4: MediaPlayer = MediaPlayer.create(applicationContext, R.raw.sound4)
        val mediaPlayer5: MediaPlayer = MediaPlayer.create(applicationContext, R.raw.sound5)
        val mediaPlayer6: MediaPlayer = MediaPlayer.create(applicationContext, R.raw.sound6)
        val mediaPlayer7: MediaPlayer = MediaPlayer.create(applicationContext, R.raw.sound7)
        button15.setOnClickListener {
            mediaPlayer0.start()
            val rnd = Random()
            val color: Int = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))
            button15.setBackgroundColor(color)
        }
        button16.setOnClickListener {
            mediaPlayer1.start()
            val rnd = Random()
            val color: Int = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))
            button16.setBackgroundColor(color)
        }
        button17.setOnClickListener {
            mediaPlayer2.start()
            val rnd = Random()
            val color: Int = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))
            button17.setBackgroundColor(color)
        }
        button18.setOnClickListener {
            mediaPlayer3.start()
            val rnd = Random()
            val color: Int = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))
            button18.setBackgroundColor(color)
        }
        button19.setOnClickListener {
            mediaPlayer4.start()
            val rnd = Random()
            val color: Int = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))
            button19.setBackgroundColor(color)
        }
        button20.setOnClickListener {
            mediaPlayer5.start()
            val rnd = Random()
            val color: Int = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))
            button20.setBackgroundColor(color)
        }
        button21.setOnClickListener {
            mediaPlayer6.start()
            val rnd = Random()
            val color: Int = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))
            button21.setBackgroundColor(color)
        }
        button22.setOnClickListener {
            mediaPlayer7.start()
            val rnd = Random()
            val color: Int = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))
            button22.setBackgroundColor(color)
        }


    }
}