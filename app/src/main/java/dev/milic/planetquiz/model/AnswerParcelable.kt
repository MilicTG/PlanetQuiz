package dev.milic.planetquiz.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class AnswerParcelable(
    var question: String,
    var answer: String,
    var details: String
): Parcelable
