package org.eu.exodus_privacy.exodusprivacy.utils

import android.content.res.ColorStateList
import androidx.core.content.ContextCompat
import com.google.android.material.chip.Chip
import org.eu.exodus_privacy.exodusprivacy.R

fun Chip.setExodusColor(size: Int) {
    val colorRed = ContextCompat.getColor(context, R.color.colorRedLight)
    val colorYellow = ContextCompat.getColor(context, R.color.colorYellow)
    val colorGreen = ContextCompat.getColor(context, R.color.colorGreen)
    val colorDark = ContextCompat.getColor(context, R.color.textColorDark)
    val colorWhite = ContextCompat.getColor(context, R.color.textColorLikeWhite)

    val textColorStateList = when (size) {
        0 -> ColorStateList.valueOf(colorDark)
        in 1..4 -> ColorStateList.valueOf(colorDark)
        else -> ColorStateList.valueOf(colorWhite)
    }

    val backgroundColorStateList = when (size) {
        0 -> ColorStateList.valueOf(colorGreen)
        in 1..4 -> ColorStateList.valueOf(colorYellow)
        else -> ColorStateList.valueOf(colorRed)
    }

    this.chipIconTint = textColorStateList
    this.setTextColor(textColorStateList)
    this.chipBackgroundColor = backgroundColorStateList
}
