package br.com.dio.work.manager

import android.app.Application
import br.com.dio.work.manager.data.datasource.VideosDataSource

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        VideosDataSource.setFromFile(assets)
    }
}
