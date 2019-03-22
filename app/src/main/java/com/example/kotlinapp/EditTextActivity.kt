package com.example.kotlinapp

import android.location.Address
import android.location.Geocoder
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class EditTextActivity : AppCompatActivity() {

    private lateinit var editAddress: EditText
    private lateinit var editCity: EditText
    private lateinit var editState: EditText
    private lateinit var editPincode: EditText
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        editAddress = findViewById<EditText>(R.id.editAddress)
        editCity = findViewById<EditText>(R.id.editCity)
        editState = findViewById<EditText>(R.id.editState)
        editPincode = findViewById<EditText>(R.id.editPincode)
        textView = findViewById<EditText>(R.id.textView)
        val button = findViewById<Button>(R.id.button)

     //   textChangeListener(editAddress)


        editAddress.onFocusChangeListener = View.OnFocusChangeListener { v, hasFocus ->
            // findLatLong(editText.text)
            if(!hasFocus){
              //  Toast.makeText(applicationContext,editAddress.text,Toast.LENGTH_SHORT).show()
            }
        }

        button.setOnClickListener{
            findLatLong()

        }
    }

    private fun textChangeListener(editText: EditText) {
        editText.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

        })
    }

    private fun findLatLong() {
        val address = editAddress.text
        val city = editCity.text
        val state = editState.text
        val pincode = editPincode.text

        val fullAddress = "$address, $city, $state, $pincode"
        val location: Address = Utils.getLocationFromAddress(this, fullAddress)
        Toast.makeText(applicationContext,"${location.latitude}  ${location.longitude}",Toast.LENGTH_LONG).show()
        textView.text = "Lat Long for $fullAddress is \n latitude :${location.latitude} longitude : ${location.longitude}"
    }
}
