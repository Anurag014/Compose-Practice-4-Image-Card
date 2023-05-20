package com.example.cp4businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent() {
            Column(modifier = Modifier.background(color = colorResource(id = R.color.background))
                .fillMaxWidth(),
            verticalArrangement = Arrangement.SpaceEvenly) {
                Title()
                Row(
                    modifier = Modifier.weight(0.5f)
                ) {
                    Content(
                        painterResource(id = R.drawable.place_1),

                        "Zhangye Danxia Geopark, China",
                        "Zhangye Danxia Geopark, China",
                        modifier = Modifier.weight(1f)
                    )
                    Content(
                        painterResource(id = R.drawable.place_2),
                        "Venice, Italy",
                        "Venice, Italy",
                        modifier = Modifier.weight(1f)
                    )
                }
                Row(
                    modifier = Modifier.weight(0.5f)
                ) {
                    Content(
                        painterResource(id = R.drawable.place_3),
                        "Machu Picchu",
                        "Machu Picchu",
                        modifier = Modifier.weight(1f)
                    )
                    Content(
                        painterResource(id = R.drawable.place_4),
                        "Bora Bora, French Polynesia",
                        "Bora Bora, French Polynesia",
                        modifier = Modifier.weight(1f)
                    )
                }
                Row(
                    modifier = Modifier.weight(0.5f)
                ) {
                    Content(
                        painterResource(id = R.drawable.place_5),
                        "Tamil Nadu, India",
                        "Tamil Nadu, India",
                        modifier = Modifier.weight(1f)
                    )
                    Content(
                        painterResource(id = R.drawable.place_6),
                        "Bagan, Myanmar",
                        "Bagan, Myanmar",
                        modifier = Modifier.weight(1f)
                    )
                }
            }
        }
    }
}

@Composable
fun Content(
        painter: Painter,
        description: String,
        title: String,
        modifier: Modifier = Modifier
) {
    Box(modifier = Modifier
        .padding(12.dp)
    ) {
        ImageCard(painter = painter, contentDescription = description, title = title)
    }
}

@Composable
fun ImageCard(
    painter: Painter,
    contentDescription: String,
    title: String,
    modifier: Modifier = Modifier
) {
    Card(
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp,
        modifier = Modifier.width(170.dp)
    ) {
        Box(modifier = Modifier.height(200.dp)) {
            Image(
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop
            )
            Box(modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Black
                        ),
                        startY = 300f
                    )
                )
            ) {}
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ) {
                Text(text = title, style = TextStyle(color = Color.White, fontSize = 16.sp))
            }
        }
    }
}

@Composable
fun Title() {
    Text(
        text = "BEAUTIFUL TOURIST DESTINATION",
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp),
        textAlign = TextAlign.Center,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
    )
}


