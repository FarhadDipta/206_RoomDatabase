package com.example.myroom.repositori

import android.app.Application
import android.content.Context

interface ContainerApp{
    val RepositoriSiswa : RepositoriSiswa
}

class ContainerDataApp(private val context: Context):
    com.example.myroomsatu.repositori.ContainerApp {
    override val RepositoriSiswa: RepositoriSiswa by lazy {
        OfflineRepositoriSiswa(
            DatabaseSiswa.getDatabase(context).siswaDao()
        )
    }
}

class AplikasiSiswa : Application() {
    lateinit var container: com.example.myroomsatu.repositori.ContainerApp

    override fun onCreate(){
        super.onCreate()
        container = ContainerDataApp(this)
    }
}