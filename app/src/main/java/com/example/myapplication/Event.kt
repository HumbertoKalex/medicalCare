package com.example.myapplication

import androidx.annotation.ColorRes

data class Event(
    val title: String,
    val description: String,
    val date: String,
    @ColorRes val color: Int,
    @ColorRes val colorBackground: Int,
)

object EventMock {
    val eventList = listOf<Event>(
        Event("Medicamento Dia", "Cafeina", "9:00 - 10:30", R.color.teal_200, R.color.teal_200),
        Event(
            "Vitaminas da tarde",
            "Vitamina B12, C, D",
            "14:00 - 15:30",
            R.color.teal_700,
            R.color.teal_200
        ),
        Event(
            "Medicamento Noite",
            "Indapramidra",
            "18:00 - 19:30",
            R.color.purple_200,
            R.color.teal_200
        ),
        Event("Tomar Agua", "", "9:00 - 10:30", R.color.purple_700, R.color.teal_200),
    )
}
