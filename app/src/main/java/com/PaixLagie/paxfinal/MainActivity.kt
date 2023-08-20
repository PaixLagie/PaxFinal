package com.PaixLagie.paxfinal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.Animation
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
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import android.view.animation.ScaleAnimation

import kotlinx.android.synthetic.main.activity_main.* // Cette ligne importe la vue ImageView




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
            text = "tax $name!",
            modifier = modifier
        )
        Text(
            text = "Bienvenue sur MedUSE",
            modifier = modifier
        )
        Image(
            painter = painterResource(id = R.drawable.ven), // Assurez-vous que ven.jpg est dans le dossier res/drawable de votre projet
            contentDescription = "Image ven",
            modifier = Modifier


        )
    }
}
@Composable
fun AnimatedImage() {
    var scale by remember { mutableStateOf(1f) }

    val animatedScale by animateFloatAsState(
        targetValue = if (scale == 1f) 1.2f else 1f,
        animationSpec = tween(1000),
        label = "" // Réglage de la durée de l'animation en millisecondes
    )

    scale = animatedScale

    Image(
        painter = painterResource(id = R.drawable.ven), // Assurez-vous d'utiliser le bon nom de fichier
        contentDescription = "Image Ven",
        modifier = Modifier
            .size(200.dp)
            .graphicsLayer(scaleX = scale, scaleY = scale)
    )
}
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    // Répète l'animation toutes les 2 secondes
    val animation = ScaleAnimation(
        1f, 1.5f, // Facteur d'échelle de départ et d'arrivée en largeur
        1f, 1.5f, // Facteur d'échelle de départ et d'arrivée en hauteur
        androidx.compose.animation.core.Animation.RELATIVE_TO_SELF, 0.5f, // Pivot en X (centre de l'image)
        android.view.animation.Animation.RELATIVE_TO_SELF, 0.5f // Pivot en Y (centre de l'image)
    ).apply {
        duration = 1000 // Durée de chaque animation (1000 ms = 1 seconde)
        repeatCount = android.view.animation.Animation.INFINITE // Répéter l'animation indéfiniment
        repeatMode = android.view.animation.Animation.REVERSE // Inverser l'animation lorsqu'elle se répète
    }

    // Appliquer l'animation à votre ImageView
    imageView.startAnimation(animation)
}
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PaxFinalTheme {
        Greeting("Thésée")
    }
}