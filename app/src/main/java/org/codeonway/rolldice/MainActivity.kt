package org.codeonway.rolldice

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnroll: TextView = findViewById(R.id.btngo)
        val ivface: ImageView = findViewById(R.id.ivface)

        val anim = AnimationUtils.loadAnimation(this, R.anim.rotate)
        ivface.startAnimation(anim)
        val player = MediaPlayer.create(this,R.raw.sound)

        btnroll.setOnClickListener{
            player.start()
            val randomNum = (1..6).random()
            val anim = AnimationUtils.loadAnimation(this, R.anim.rotate)
            ivface.startAnimation(anim)

            if (randomNum == 1)
            {
                ivface.setImageResource(R.drawable.diceone)
            }
            else if (randomNum == 2)
            {
                ivface.setImageResource(R.drawable.dicetwo)
            }
            else if (randomNum == 3)
            {
                ivface.setImageResource(R.drawable.dicethree)
            }

            else if (randomNum == 4)
            {
                ivface.setImageResource(R.drawable.dicefour)
            }
            else if (randomNum == 5)
            {
                ivface.setImageResource(R.drawable.dicefive)
            }
            else
            {
                ivface.setImageResource(R.drawable.dicesix)
            }
        }
    }
}