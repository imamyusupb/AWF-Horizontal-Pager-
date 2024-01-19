package com.yusuf.learning.recomposition

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp



/*
  [ItemPager] composable function ini akan di panggil kedalam Horizontal Pager,
  sesuaikan apa yang mau ditampilkan, anggap lah ini fungsi yang menampilkan 1 data,
  jadi anggaplah ini ketika dipanggil akan menampilkan,
      1.Image
      1.Text


  Kesimpulannya : ini merupakan content Horizontal Pagernya yah,
 */

@Composable
fun ItemPager(data: DataKopi) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(150.dp)
            .padding(horizontal = 16.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(
                Color.Gray
            )
    ) {
        Image(painter = painterResource(id = data.icon), contentDescription = data.deskripsi)
        Text(text = data.deskripsi, color = Color.White)
    }
}
