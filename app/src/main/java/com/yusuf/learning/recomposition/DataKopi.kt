package com.yusuf.learning.recomposition


/*
    [DataKopi] Merupakan class yang ditunjukan untuk menampung variabel/atribut.
    class ini akan digunakan untuk keperluan Tampilan User Interface ( UI ).

    Variabel [listDataKopi], pada bahasa pemrograman Kotlin, kita bisa membuat variabel maupun function
    dengan membuat class atau tidak sama sekali. pada kasus ini kita tidak membuat class yang di dalam blok
    classnya terdapat variabel listDataKopi benar ? perhatikan kembali

 */

data class DataKopi(
    val deskripsi: String,
    val icon: Int
)

val listDataKopi = listOf(
    DataKopi(deskripsi = "Minuman Kopi Yang Enak", icon = R.drawable.icon_category_cappuccino),
    DataKopi(deskripsi = "Minuman Kopo Yang Asam", icon = R.drawable.icon_category_espresso)
)