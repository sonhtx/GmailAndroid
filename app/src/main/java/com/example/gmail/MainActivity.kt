package com.example.gmail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inboxes = arrayListOf<GmailModel>()
        repeat(9) {
            val index = it + 1
            inboxes.add(GmailModel("Son Hoang", "Hello, I'm glad to inform you that you are our Ballon d'or this year. Please blabla",
                resources.getIdentifier("thumb$index", "drawable", packageName)))
        }

        findViewById<ListView>(R.id.inbox_list).adapter = GmailAdapter(inboxes)
    }
}