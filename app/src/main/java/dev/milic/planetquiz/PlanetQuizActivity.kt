package dev.milic.planetquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.milic.planetquiz.databinding.ActivityPlanetQuizBinding

class PlanetQuizActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPlanetQuizBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlanetQuizBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}