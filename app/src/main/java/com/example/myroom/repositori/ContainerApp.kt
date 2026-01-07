package com.example.myroom.repositori

import android.app.Application
import android.content.Context
import com.example.myroom.room.DatabaseSiswa

interface ContainerApp{
    val RepositoriSiswa : RepositoriSiswa
}

class ContainerDataApp(private val context: Context):
    com.example.myroom.repositori.ContainerApp {
    override val RepositoriSiswa: RepositoriSiswa by lazy {
        OfflineRepositoriSiswa(
            DatabaseSiswa.getDatabase(context).siswaDao()
        )
    }
}

class AplikasiSiswa : Application() {
    lateinit var container: com.example.myroom.repositori.ContainerApp

    override fun onCreate(){
        super.onCreate()
        container = ContainerDataApp(this)
    }
}