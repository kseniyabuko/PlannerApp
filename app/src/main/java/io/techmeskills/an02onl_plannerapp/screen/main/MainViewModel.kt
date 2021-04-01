package io.techmeskills.an02onl_plannerapp.screen.main

import io.techmeskills.an02onl_plannerapp.support.CoroutineViewModel

class MainViewModel : CoroutineViewModel() {

    val notes = listOf(
        Note("Написать в налоговую"),
        Note("Забрать пальто из химчистки", "23.03.2021"),
        Note("Позвонить Ибрагиму"),
        Note("Заказать перламутровые пуговицы"),
        Note("Избить соседа за шум ночью"),
        Note("Выпить на неделе с Володей", "22.03.2021"),
        Note("Починить кран"),
        Note("Выбить ковры перед весной"),
        Note("Заклеить сапог жене"),
        Note("Купить картошки"),
        Note("Скачать кино в самолёт", "25.03.2021"),

        // added 2 Notes
        Note("Пересадить цветы", "01.04.2021"),
        Note("Заказать еду")
    )

}

class Note(
    val title: String,
    val date: String? = null
)