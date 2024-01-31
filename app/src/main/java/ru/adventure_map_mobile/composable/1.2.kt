package ru.adventure_map_mobile.composable

import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Slider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.adventure_map_mobile.R
import ru.adventure_map_mobile.ui.theme.Adventure_map_mobileTheme

@Composable
fun HeaderImage(id: Int, modifier: Modifier){
    var image = painterResource(id = id)
    Box(modifier = modifier){
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
        )
    }
}

@Composable
fun MainContent(modifier: Modifier){
    Box(modifier = modifier){
        Column(

        ) {
            HeaderImage(
                id = R.drawable.bg_compose_background,
                modifier = Modifier,
            )
            Text(
                text = stringResource(R.string.first_second_first_first_text),
                fontSize = 24.sp,
                    modifier = Modifier
                        .padding(16.dp)
            )
            Text(
                text = stringResource(R.string.first_second_first_second_text),
                textAlign = TextAlign.Justify,
                modifier = Modifier
                    .padding(
                        start = 16.dp,
                        end = 16.dp
                    )
            )
            Text(
                text = stringResource(R.string.first_second_first_third_text),
                textAlign = TextAlign.Justify,
                modifier = Modifier
                    .padding(16.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LearnPagePreview(){
    Adventure_map_mobileTheme {
        MainContent(modifier = Modifier)
    }
}