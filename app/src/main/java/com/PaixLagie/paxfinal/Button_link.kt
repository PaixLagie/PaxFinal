package com.PaixLagie.paxfinal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView



private fun onButtonClick(view: View) {

    // Get the user's name
    val editText: EditText = view.findViewById(R.id.bt_1)
    val name = editText.text.toString()

    // Display the user's name
    val textView: TextView = view.findViewById(R.id.bt_1)
    textView.text = "Hello, $name!"

}
