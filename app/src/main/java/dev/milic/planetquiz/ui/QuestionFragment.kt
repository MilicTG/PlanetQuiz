package dev.milic.planetquiz.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import dev.milic.planetquiz.R
import dev.milic.planetquiz.databinding.FragmentQuestionsBinding

class QuestionFragment : Fragment() {

    private lateinit var binding: FragmentQuestionsBinding

    private val answerOne = listOf("JUPITER", R.string.question_one)
    private val answerTwo = listOf("SATURN", R.string.question_two)
    private val answerThree = listOf("URANUS", R.string.question_three)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentQuestionsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        startFirstQuestion()
        startSecondQuestion()
        startThirdQuestion()
    }

    private fun startFirstQuestion() {
        val bundle = bundleOf("Answer" to answerOne)

        binding.btnQuestionOne.setOnClickListener {
            view?.findNavController()
                ?.navigate(R.id.action_questionFragment_to_answersFragment, bundle)
        }
    }

    private fun startSecondQuestion() {
        val bundle = bundleOf("Answer" to answerTwo)

        binding.btnQuestionTwo.setOnClickListener {
            view?.findNavController()
                ?.navigate(R.id.action_questionFragment_to_answersFragment, bundle)
        }
    }

    private fun startThirdQuestion() {
        val bundle = bundleOf("Answer" to answerThree)

        binding.btnQuestionThree.setOnClickListener {
            view?.findNavController()
                ?.navigate(R.id.action_questionFragment_to_answersFragment, bundle)
        }
    }
}