package com.example.mvvm

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class QuotesActivity : AppCompatActivity() {
    private lateinit var quoteEditText: EditText
    private lateinit var authorEditText: EditText
    private lateinit var addButton: Button
    private lateinit var textView1: TextView
    private lateinit var textView2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quotes)

        // Find views by their IDs
        quoteEditText = findViewById(R.id.Quote)
        authorEditText = findViewById(R.id.Author)
        addButton = findViewById(R.id.button_add_quote)
        textView1 = findViewById(R.id.textView)
        textView2 = findViewById(R.id.textView2)

        // Set OnClickListener to the button
        addButton.setOnClickListener {
            // Get text from EditTexts
            val quoteText = quoteEditText.text.toString()
            val authorText = authorEditText.text.toString()

            // Update TextViews
            textView1.text = quoteText
            textView2.text = authorText
        }
    }
}
