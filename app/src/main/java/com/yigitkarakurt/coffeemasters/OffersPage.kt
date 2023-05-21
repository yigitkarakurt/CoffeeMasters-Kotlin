package com.yigitkarakurt.coffeemasters

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yigitkarakurt.coffeemasters.ui.theme.Alternative1
import com.yigitkarakurt.coffeemasters.ui.theme.Alternative2

@Preview(showBackground = true)
@Composable
private fun Offer_Preview(){
    Offers(title = "My Title", desc = "Description")
}

@Composable
fun Offers(title: String, desc: String) {

    val style = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal
    )
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(16.dp)
    ) {
        Text(text = title,
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier
                .background(Alternative1)
                .padding(16.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = desc,
            style = style,
            modifier = Modifier
                .background(Alternative2)
                .padding(16.dp)
        )
    }
}