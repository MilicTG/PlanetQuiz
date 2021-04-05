package dev.milic.planetquiz.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import dev.milic.planetquiz.R
import dev.milic.planetquiz.databinding.FragmentQuestionsBinding
import dev.milic.planetquiz.model.AnswerParcelable

class QuestionFragment : Fragment() {

    private lateinit var binding: FragmentQuestionsBinding

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
        val actionDetail = QuestionFragmentDirections.actionQuestionFragmentToAnswersFragment()
        actionDetail.answerParce = AnswerParcelable(
            getString(R.string.question_one),
            "JUPITER",
            getString(R.string.jupiter_answer)
        )

        binding.btnQuestionOne.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(actionDetail)
        }
    }

    private fun startSecondQuestion() {
        val actionDetail = QuestionFragmentDirections.actionQuestionFragmentToAnswersFragment()
        actionDetail.answerParce = AnswerParcelable(
            getString(R.string.question_two),
            "SATURN",
            getString(R.string.saturn_answer)
        )

        binding.btnQuestionTwo.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(actionDetail)
        }
    }

    private fun startThirdQuestion() {
        val actionDetail = QuestionFragmentDirections.actionQuestionFragmentToAnswersFragment()
        actionDetail.answerParce = AnswerParcelable(
            getString(R.string.question_three),
            "URANUS",
            getString(R.string.uranus_answer)
        )

        binding.btnQuestionThree.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(actionDetail)
        }
    }
}