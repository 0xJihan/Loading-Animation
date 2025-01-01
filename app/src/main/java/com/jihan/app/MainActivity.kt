package com.jihan.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jihan.animation.BlurredAnimatedText
import com.jihan.animation.OrbitLoading
import com.jihan.animation.PulseAnimation
import com.jihan.app.ui.theme.AppTheme


class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()





        setContent {
            AppTheme {
                CenterBox(Modifier.fillMaxSize()) {
                    Text(text = "Pulse Animation", fontSize = 20.sp)
                   PulseAnimation()
                    Spacer(Modifier.height(30.dp))
                    Text(text = "Orbit Loading", fontSize = 20.sp)
                    OrbitLoading(Modifier.size(50.dp))
                    Spacer(Modifier.height(20.dp))
                   BlurredAnimatedText("This is a blurred text")
                }
            }
        }
    }

}

@Composable
fun CenterBox(modifier: Modifier = Modifier,content: @Composable ColumnScope.() -> Unit) {
    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center, modifier = modifier.background(MaterialTheme.colorScheme.background)) {
        content()
    }
}


