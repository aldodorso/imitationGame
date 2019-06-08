package com.example.whatsapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView


class MainActivity : AppCompatActivity() {
    var webview: WebView? = null

    override fun onBackPressed() {
        if (webview!!.canGoBack())
            webview!!.goBack()
        else
            super.onBackPressed()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        webview = findViewById<WebView>(R.id.web)
        webview!!.settings.javaScriptEnabled = true
        webview!!.webChromeClient = WebChromeClient()
        webview!!.loadUrl("http://ubuntu-91.ddns.net:3000")
    }
}