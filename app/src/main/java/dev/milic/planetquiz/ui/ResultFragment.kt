package dev.milic.planetquiz.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import dev.milic.planetquiz.R
import dev.milic.planetquiz.databinding.FragmentResultBinding

class ResultFragment : Fragment() {

    private lateinit var binding: FragmentResultBinding
    private val args: ResultFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentResultBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setAnswer()
        resetGame()
    }

    private fun setAnswer() {
        val detailText = args.resultParce?.details
        val result = args.resultParce!!.result

        if (result) {
            binding.tvResult.text = getString(R.string.correct)
        } else {
            binding.tvResult.text = getString(R.string.wrong)
        }
        binding.tvResultAnswer.text = detailText
    }

    private fun resetGame() {
        binding.btnRestart.setOnClickListener {
            Navigation.findNavController(binding.root)
                .navigate(R.id.action_resultFragment_to_questionFragment)
        }
    }
}