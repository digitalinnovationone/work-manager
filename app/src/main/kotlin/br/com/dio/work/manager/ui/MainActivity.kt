package br.com.dio.work.manager.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.dio.work.manager.R
import br.com.dio.work.manager.worker.NotificationWorker

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        NotificationWorker.start(this)
    }
}