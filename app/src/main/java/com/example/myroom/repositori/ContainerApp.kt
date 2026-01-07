package com.example.myroom.repositori

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