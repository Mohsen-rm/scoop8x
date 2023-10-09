package com.ajiashi.Scoop8x.include

import android.content.Context
import android.content.SharedPreferences
import com.ajiashi.Scoop8x.R

class Data(private val context: Context) {
    private var title: String?
    private var img_sinper: Int
    private var url_voice : Int

    var isIs_sinper: Boolean
        private set
    var is_voice: Boolean = false
        private set
    var editor: SharedPreferences.Editor
    fun getTitle(): String? {
        return title
    }

    fun setTitle(title: String?) {
        this.title = title
        editor.putString("title", title)
        editor.apply()
    }

    fun getImg_sinper(): Int {
        return img_sinper
    }

    fun getUrl_voice(): Int {
        return url_voice
    }

    fun getIs_voice(): Boolean {
        return is_voice
    }

    fun setImg_sinper(img_sinper: Int) {
        this.img_sinper = img_sinper
        editor.putInt("img_sinper", img_sinper)
        editor.apply()
    }

    fun setIs_sinper(is_sinper: Boolean) {
        isIs_sinper = is_sinper
        editor.putBoolean("is_sinper", is_sinper)
        editor.apply()
    }

    fun setUrl_voice(url_voice: Int) {
        this.url_voice = url_voice
        editor.putInt("url_voice", url_voice)
        editor.apply()
    }

    fun setIs_Voice(is_voice: Boolean) {
        isIs_sinper = is_voice
        editor.putBoolean("is_voice", is_voice)
        editor.apply()
    }

    init {
        val preferences = context.getSharedPreferences("app_data", Context.MODE_PRIVATE)
        title = preferences.getString("title", "NULL")
        img_sinper = preferences.getInt("img_sinper", R.drawable.ic_sinper2)
        isIs_sinper = preferences.getBoolean("is_sinper", false)
        url_voice = preferences.getInt("url_voice",R.raw.sniper_rifle)
        is_voice = preferences.getBoolean("is_voice",false)
        editor = preferences.edit()
    }
}