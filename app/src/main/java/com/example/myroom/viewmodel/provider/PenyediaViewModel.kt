package com.example.myroom.viewmodel.provider

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.myroom.repositori.AplikasiSiswa
import com.example.myroom.viewmodel.DetailViewModel
import com.example.myroom.viewmodel.EditViewModel
import com.example.myroom.viewmodel.EntryViewModel
import com.example.myroom.viewmodel.HomeViewModel

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(aplikasiSiswa().container.RepositoriSiswa)
        }
        initializer {
            EntryViewModel(aplikasiSiswa().container.RepositoriSiswa)
        }
//tambahan
        initializer {
            DetailViewModel(
                this.createSavedStateHandle(),
                aplikasiSiswa().container.RepositoriSiswa
            )
        }
        initializer {
            EditViewModel(this.createSavedStateHandle(), aplikasiSiswa().container.RepositoriSiswa)
        }
    }
}

fun CreationExtras.aplikasiSiswa(): AplikasiSiswa =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY]as AplikasiSiswa)