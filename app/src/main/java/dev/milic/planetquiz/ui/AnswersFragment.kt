package dev.milic.planetquiz.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavArgs
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import dev.milic.planetquiz.databinding.FragmentAnswersBinding
import dev.milic.planetquiz.model.ResultParcelable

class AnswersFragment : Fragment() {

    private lateinit var binding: FragmentAnswersBinding
    private val args: AnswersFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAnswersBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setQuestionTitle()
        setButtonClick()
    }

    private fun setQuestionTitle() {
        val title = args.answerParce?.question
        binding.tvQuestion.text = title
    }

    private fun setButtonClick() {
        binding.btnAnswerOne.setOnClickListener {
            checkForAnswer("MERCURY")
        }

        binding.btnAnswerTwo.setOnClickListener {
            checkForAnswer("VENUS")
        }

        binding.btnAnswerThree.setOnClickListener {
            checkForAnswer("EARTH")
        }

        binding.btnAnswerFour.setOnClickListener {
            checkForAnswer("MARS")
        }

        binding.btnAnswerFive.setOnClickListener {
            checkForAnswer("JUPITER")
        }

        binding.btnAnswerSix.setOnClickListener {
            checkForAnswer("SATURN")
        }

        binding.btnAnswerSeven.setOnClickListener {
            checkForAnswer("URANUS")
        }

        binding.btnAnswerEight.setOnClickListener {
            checkForAnswer("NEPTUNE")
        }
    }

    private fun checkForAnswer(planet: String) {
        val correctPlanet = args.answerParce?.answer
        val answerDesc = args.answerParce!!.details
        val actionDetails = AnswersFragmentDirections.actionAnswersFragmentToResultFragment()

        if (planet == correctPlanet) {
            actionDetails.resultParce = ResultParcelable(answerDesc, true)
        } else {
            actionDetails.resultParce = ResultParcelable(answerDesc, false)
        }
        Navigation.findNavController(binding.root).navigate(actionDetails)
    }
}