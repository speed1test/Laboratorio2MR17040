package com.example.laboratorio2mr17040.db
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "juego")
data class JuegoEntity (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "idJuego")
    var id: Long = 0,

    val nombre: String,
    val descripcion:String,
    val cantMinJugadores:Int,
    val cantMaxJugadores:Int,
    @ColumnInfo(name="mat_ganadas",defaultValue = "0")
    val matGanadas:Int
)