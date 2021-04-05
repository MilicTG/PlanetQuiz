package dev.milic.planetquiz.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ResultParcelable(
    var details: String,
    var result: Boolean
): Parcelable
