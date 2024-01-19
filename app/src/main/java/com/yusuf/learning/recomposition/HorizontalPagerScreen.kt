package com.yusuf.learning.recomposition

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


/*
   [HorizontalPagerScreen] ini User Interface ( UI ) yang akan menampilkan kebutuhan anda,
   dalam kasus ini kita membutuhkan tampilan untuk horizontal pager,
   di dalam fungsi ini, kita tambahkan Komponen Horizontal Pager
   berseta Statenya(hal yang sifatnya mempertahankan) data atau keadaan UI yang mau di tampilkan


   [HorizontalPager] mengharuskan kita untuk mengisi parameter <state>. coba perhatikan baik-baik
   parameter state harus di isi dengan state, state yang diminta tipenya pager state

   cara membuatnya cukup definisikan variabel dan isi dengan nilai statenya
   val state = rememberPagerState()


   setiap membuat state, selalu perhatikan apa yang diminta parameter statenya, contoh disini minta :

   pageCount = jumlah konten yang mau ditampilkan
   initialPage = urutan konten mana yang mau ditampilkan pertama
   initialPageOffetFraction = .....

   Hubungkan parameter nya dengan kondisi data anda masing masing yah !

 */


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HorizontalPagerScreen() {

    val pagerState = rememberPagerState(
        initialPage = 0,
        pageCount = { listDataKopi.size },
        initialPageOffsetFraction = 0f
    )

    Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Row(
            Modifier
                .fillMaxWidth()
                .heightIn(50.dp)
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Letakan Icon disini")
            Text(text = "Tombol Login")
        }
        HorizontalPager(
            state = pagerState,
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(100.dp)
                .weight(1f)
                .background(Color.White)
        ) {
            ItemPager(data = listDataKopi[it])
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(50.dp)
                .padding(horizontal = 16.dp)
                .background(Color.White),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween

        ) {
            Text(text = "Tombol Balik")
            Text(text = "Tombol Lanjut")
        }
    }

}
