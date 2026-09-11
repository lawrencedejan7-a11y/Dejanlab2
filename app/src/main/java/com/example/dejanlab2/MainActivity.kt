package com.example.dejanlab2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfileScreen()
        }
    }
}

@Composable
fun ProfileScreen() {
    val darkBackground = Color(0xFF525254)
    val purpleAccent = Color(0xFF009688)
    val lightPurpleText = Color(0xFFF5F5F5)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(darkBackground)
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // for the avatar picture
        Image(
            painter = painterResource(id = R.drawable.avatar),
            contentDescription = "Profile Picture",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(130.dp)
                .clip(CircleShape)
                .border(3.dp, lightPurpleText, CircleShape)
        )

        Spacer(modifier = Modifier.height(20.dp))
        // for the name text
        Text(
            text = "Lawrence Dejan",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

        Spacer(modifier = Modifier.height(6.dp))
        // for the course
        Text(
            text = "BSIT Student Mobile Developer",
            fontSize = 14.sp,
            color = Color.LightGray
        )

        Spacer(modifier = Modifier.height(24.dp))
// for the email
        Text(
            text = "lawrencedejan7@gmail.com",
            fontSize = 15.sp,
            color = Color.White
        )

        Spacer(modifier = Modifier.height(12.dp))
// for the mobile number
        Text(
            text = "09614605708",
            fontSize = 15.sp,
            color = Color.White
        )

        Spacer(modifier = Modifier.height(32.dp))
// for the message button
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Button(
                onClick = { },
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = purpleAccent,
                    contentColor = darkBackground
                ),
                modifier = Modifier.height(42.dp)
            ) {
                Text(text = "Message", fontWeight = FontWeight.Bold)
            }
// for the follow button
            OutlinedButton(
                onClick = { },
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.White),
                modifier = Modifier.height(42.dp)
            ) {
                Text(text = "Follow")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}