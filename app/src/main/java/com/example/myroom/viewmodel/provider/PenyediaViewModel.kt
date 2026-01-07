package com.example.myroom.viewmodel.provider

import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory

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
            DetailViewModel(this.createSavedStateHandle(),aplikasiSiswa().container.RepositoriSiswa)
        }
        initializer {
            EditViewModel(this.createSavedStateHandle(), aplikasiSiswa().container.RepositoriSiswa)
        }
    }
}