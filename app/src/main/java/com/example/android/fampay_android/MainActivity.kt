package com.example.android.fampay_android

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Forward
import androidx.compose.material.icons.outlined.NavigateNext
import androidx.compose.material.icons.outlined.SkipNext
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.android.fampay_android.ui.theme.FampayAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { FampayApp() }
    }
}

@Composable
fun HC3(
    image: String,
    title: String,
    description: String,
    aspectRatio: Float,
    cardCTA: () -> Unit,
    buttonCTA: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Card(modifier = modifier
        .height(350.dp)         // fixed height of HC3 Card
        .fillMaxWidth()         // full width
        .padding(horizontal = 20.dp)
        .clickable(
            onClick = cardCTA
        ),
        shape = RoundedCornerShape(12.dp),
    ) {
        AsyncImage(
            model = image,
            contentDescription = null,
            modifier = Modifier.aspectRatio(aspectRatio)
        )
        Column(
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier.padding(start = 33.dp, end = 33.dp)
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.h5.copy(fontWeight = FontWeight.Bold)
            )
            Spacer(modifier = Modifier.height(28.dp))
            Text(text = description)
            Button(
                modifier = Modifier.padding(top = 20.dp, bottom = 12.dp),
                onClick = buttonCTA,
                content = {
                    Text("Action")
                }
            )
        }
    }

}

@Composable
fun HC6(
    image: String,
    title: String,
    CTA: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .height(60.dp)
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
            .clickable(onClick = CTA),
        shape = RoundedCornerShape(12.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = 20.dp)
        ) {
            AsyncImage(
                model = image,
                contentDescription = null,
                modifier = Modifier
                    .size(30.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(15.dp))
            Text(
                text = title,
                modifier = Modifier.weight(1.0F),
                style = MaterialTheme.typography.body2.copy(fontWeight = FontWeight.SemiBold)
            )
            Icon(
                imageVector = Icons.Outlined.NavigateNext,
                contentDescription = null,
            )
        }
    }
}

@Composable
fun HC5(
    image: String,
    CTA: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier
        .fillMaxWidth()
        .padding(horizontal = 20.dp)
        .clickable(
            onClick = CTA
        )
    ) {
        AsyncImage(
            model = image,
            contentDescription = null)
    }
}

@Composable
fun HC9(
    image: String,
    aspectRatio: Float,
    CTA: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .height(195.dp)
            .padding(horizontal = 15.dp)
            .clickable(
                onClick = CTA
            )
    ) {
        AsyncImage(
            model = image,
            contentDescription = null,
            modifier = Modifier.aspectRatio(aspectRatio)
        )
    }
}

@Composable
fun HC1(
    image: String,
    title: String,
    bgColor: Color,
    CTA: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier
        .height(60.dp)
        .fillMaxWidth()
        .padding(horizontal = 20.dp)
        .clickable(
            onClick = CTA
        ),
        backgroundColor = bgColor
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 15.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                model = image,
                contentDescription = null,
                modifier = Modifier
                    .clip(CircleShape)
                    .size(40.dp)
            )
            Spacer(modifier = Modifier.width(20.dp))
            Text(text = title)
        }
    }
}

@Composable
fun FampayApp() {
//    val context = LocalContext.current
//    HC3(
//        image = "https://westeros-staging.s3.amazonaws.com/media/images/generic/5e97239d1bd747878828852d4f397361.png",
//        title = "Big Display Card with Action",
//        description = "This is a sample text for the subtitle that you can add to contextual cards",
//        aspectRatio = 0.9142857F,
//        cardCTA = {
//            Toast.makeText(context, "Helloo", Toast.LENGTH_SHORT).show()
//        },
//        buttonCTA = {}
//        )
//    HC6(
//        image = "https://d1nhio0ox7pgb.cloudfront.net/_img/o_collection_png/green_dark_grey/128x128/plain/shape_square.png",
//        title = "Small card with arrow",
//        CTA = {}
//    )
//    HC5(
//        image = "https://westeros-staging.s3.amazonaws.com/media/images/generic/a612b3e534ba4ca389293a2b92c7ba25.jpeg",
//        CTA = {}
//    )
//    HC9(
//        image = "https://westeros-staging.s3.amazonaws.com/media/images/generic/718171493a944663a167a71c11c5e10a.png",
//        aspectRatio = 0.84F,
//        CTA = {}
//    )
    HC1(
        image = "https://westeros-staging.s3.amazonaws.com/media/images/generic/4ce76db9e755497f8d176764b6d590ba.png",
        title = "Small display card",
        bgColor = Color.White,
        CTA = {}
    )
}


@Preview(showBackground = true)
@Composable
fun HC3Preview() {
    val context = LocalContext.current
    HC3(
        image = "https://westeros-staging.s3.amazonaws.com/media/images/generic/5e97239d1bd747878828852d4f397361.png",
        title = "Big Display Card with Action",
        description = "This is a sample text for the subtitle that you can add to contextual cards",
        aspectRatio = 0.9142857F,
        cardCTA = {
            Toast.makeText(context, "Helloo", Toast.LENGTH_SHORT).show()
        },
        buttonCTA = {}
    )
}

@Preview(showBackground = true)
@Composable
fun HC6Preview() {
    HC6(
        image = "https://d1nhio0ox7pgb.cloudfront.net/_img/o_collection_png/green_dark_grey/128x128/plain/shape_square.png",
        title = "Small card with arrow",
        CTA = {}
    )
}

@Preview(showBackground = true)
@Composable
fun HC5Preview() {
    HC5(
        image = "https://westeros-staging.s3.amazonaws.com/media/images/generic/a612b3e534ba4ca389293a2b92c7ba25.jpeg",
        CTA = {}
    )
}

@Preview(showBackground = true)
@Composable
fun HC9Preview() {
    HC9(
        image = "https://westeros-staging.s3.amazonaws.com/media/images/generic/718171493a944663a167a71c11c5e10a.png",
        aspectRatio = 0.84F,
        CTA = {}
    )
}

@Preview(showBackground = true)
@Composable
fun HC1Preview() {
    HC1(
        image = "https://westeros-staging.s3.amazonaws.com/media/images/generic/4ce76db9e755497f8d176764b6d590ba.png",
        title = "Small display card",
        bgColor = Color.White,
        CTA = {}
    )
}

@Preview(widthDp = 360, heightDp = 640)
@Composable
fun FampayAppPreview() {
    FampayApp()
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FampayAndroidTheme {
        Greeting("Android")
    }
}