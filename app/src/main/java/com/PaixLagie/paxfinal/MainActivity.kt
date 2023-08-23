package com.PaixLagie.paxfinal

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
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import android.view.View
import android.widget.TextView
import androidx.navigation.NavController
import androidx.compose.material3.TextField
import androidx.compose.foundation.layout.padding
import androidx.databinding.DataBindingUtil.setContentView
import android.widget.Toast
import android.app.AlertDialog
import android.content.DialogInterface

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.databinding.DataBindingUtil
import com.PaixLagie.paxfinal.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

    val button = binding.bt2 // Assurez-vous que le nom correspond à celui de votre bouton dans la mise en page XML

    button.setOnClickListener {
        // Créez une boîte de dialogue pour demander le nom de l'utilisateur
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Entrez votre nom")

        val input = EditText(this)
        builder.setView(input)

        builder.setPositiveButton("OK") { _: DialogInterface, _: Int ->
            val name = input.text.toString()
            // Faites quelque chose avec le nom (par exemple, affichez-le)
            if (name.isNotEmpty()) {
                // Affichez le nom dans la console
                println("Nom de l'utilisateur : $name")
            }
        }

        builder.setNegativeButton("Annuler") { dialog: DialogInterface, _: Int ->
            dialog.cancel()
        }

        builder.show()
    }
}
}
//private fun onButtonClick(view: View) {

    // Get the user's name
   // val editText: EditText = view.findViewById(R.id.bt_1)
    //val name = editText.text.toString()

    // Display the user's name
   // val textView: TextView = view.findViewById(R.id.vbt_1)
    //textView.text = "Hello, $name!"



