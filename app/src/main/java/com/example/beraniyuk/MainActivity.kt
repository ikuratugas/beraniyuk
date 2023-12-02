package com.example.beraniyuk

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColor
import androidx.lifecycle.ViewModel
import com.example.beraniyuk.ui.theme.BeraniYukTheme

class MainActivity : ComponentActivity() {
    private val viewmodel by viewModels<MyViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BeraniYukTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    MainScreen(viewmodel)

                }
            }
        }
    }
}



@Composable
fun MainScreen(viewmodel:MyViewModel){
    Surface {

        Column(
            modifier = Modifier.fillMaxHeight().fillMaxWidth(0.8f), verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Button(onClick = { viewmodel.tombol4click() }, enabled = viewmodel.enabtombol4, modifier = Modifier.alpha(viewmodel.hidetombol4).padding(10.dp), colors = ButtonDefaults.buttonColors(Color(R.color.purple_500))) { Text(text = "Nda") }

            Image(painter = painterResource(id = R.drawable.love), contentDescription = "", modifier = Modifier.height(120.dp).width(120.dp))
            
            Text(text = viewmodel.pesanku, fontWeight = FontWeight.ExtraBold, color = Color(R.color.purple_200), fontSize = 18.sp, textAlign = TextAlign.Center)
            
            Spacer(modifier = Modifier.padding(5.dp))
            
            Row(modifier = Modifier.fillMaxWidth(0.5f), horizontalArrangement = Arrangement.SpaceAround) {
                Button(onClick = { viewmodel.tombolmau() }, enabled = viewmodel.enabtombolmau, modifier = Modifier.alpha(viewmodel.hidetombolmau)) { Text(text = "Mau") }
                Button(onClick = {viewmodel.tombol1click()}, enabled = viewmodel.enabtombol1, modifier = Modifier.alpha(viewmodel.hidetombol1) , colors = ButtonDefaults.buttonColors(Color(R.color.purple_500))) { Text(text = "Nda") }
            }

            Spacer(modifier = Modifier.padding(5.dp))

            Row(modifier = Modifier.fillMaxWidth(0.8f), horizontalArrangement = Arrangement.SpaceEvenly) {
                Button(onClick = {viewmodel.tombol2click()}, enabled = viewmodel.enabtombol2, modifier = Modifier.alpha(viewmodel.hidetombol2), colors = ButtonDefaults.buttonColors(Color(R.color.purple_500))) { Text(text = "Nda") }

                Button(onClick = {viewmodel.tombol3click()}, enabled = viewmodel.enabtombol3, modifier = Modifier.alpha(viewmodel.hidetombol3), colors = ButtonDefaults.buttonColors(Color(R.color.purple_500))) { Text(text = "Nda") }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BeraniYukTheme {

    }
}