package com.example.myroom.room

@Entity(tableName = "tblSiswa)
data class Siswa(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var nama: String = "",
)
