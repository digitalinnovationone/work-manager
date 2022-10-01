package br.com.dio.work.manager.data.datasource

import android.content.res.AssetManager
import br.com.dio.work.manager.data.model.Video
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

object VideosDataSource {
    private val list by lazy { arrayListOf<Video>() }

    fun setFromFile(assetManager: AssetManager) {
        val videosFromFile = Gson().fromFile<List<Video>>(assetManager, "videos.json")
        list.addAll(videosFromFile)
    }

    private inline fun <reified T> Gson.fromFile(assetManager: AssetManager, filename: String): T {
        return fromJson(
            assetManager.open(filename).bufferedReader(),
            object : TypeToken<T>() {}.type
        )
    }
}
