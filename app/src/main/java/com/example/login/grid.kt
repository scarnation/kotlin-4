package com.example.login


import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_grid.*

class grid : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid)
        facebook.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse(""))
            startActivity(intent)

        }
        imageButton.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.github.com/"))
            startActivity(intent)

        }
        imageButton2.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.Bitbucket.com/"))
            startActivity(intent)

        }
        imageButton8.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("http://instagram.com/_u/{USERNAME}/"))
            startActivity(intent)

        }
        android.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://developers.android.com/"))
            startActivity(intent)

        }
        drible.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.dribble.com/"))
            startActivity(intent)

        }
        google.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.youtube.com/"))
            startActivity(intent)

        }
        googleplus.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.googleplus.com/"))
            startActivity(intent)

        }
        play.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("http://play.google.com/store/apps/details?id=<package_name>"))
            startActivity(intent)

        }
        link.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse(" www.linkedin.com/in"))
            startActivity(intent)

        }
        skype.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.skype.com/"))
            startActivity(intent)

        }
        twitter.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.twitter.com/"))
            startActivity(intent)

        }
        webview.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.start.ng/"))
            startActivity(intent)

        }
        slack.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("slack://app?team={TEAM_ID}&id={APP_ID}"))
            startActivity(intent)

        }
        whatsapp.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://wa.me/15551234567"))
            startActivity(intent)

        }
    }
}
