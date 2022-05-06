package com.marquez.smlab06_musicfast.model

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

data class Repository(val musics:MutableList<Music> = ArrayList()) {

    init {
        getDataMusics()
    }

    fun getDataMusics(): List<Music> {
        musics.add(Music(1, "BBoom BBoom", "Momoland", "ic_artist_1", "k-pop"))
        musics.add(Music(2, "Yummy Love", "Momoland", "ic_artist_1", "k-pop"))
        musics.add(Music(3, "Boombayah", "BLACKPINK", "ic_artist_2", "k-pop"))
        musics.add(Music(4, "How You Like That", "BLACKPINK", "ic_artist_2", "k-pop"))
        musics.add(Music(5, "Bad Sweet Trap", "LiSA", "ic_artist_3", "rock"))
        musics.add(Music(6, "L.Miranic", "LiSA", "ic_artist_3", "rock"))
        musics.add(Music(7, "CHAIN", "ASCA", "ic_artist_4", "pop"))
        musics.add(Music(8, "RESISTER", "ASCA", "ic_artist_4", "pop"))
        return musics
    }
}