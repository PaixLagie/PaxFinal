package com.PaixLagie.paxfinal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import com.PaixLagie.paxfinal.ui.theme.PaxFinalTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PaxFinalTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) { // Utilisez un Column pour organiser les composables verticalement
        Text(
            text = "Bonjour $name!",
            modifier = modifier
        )
        Text(
            text = "Bienvenue sur MedUSE",
            modifier = modifier
        )
        Image(
            painter = painterResource(id = R.drawable.Ven), // Assurez-vous que Ven.jpg est dans le dossier res/drawable de votre projet
            contentDescription = "Image Ven",
            modifier = Modifier


        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PaxFinalTheme {
        Greeting("Thésée")
    }
}