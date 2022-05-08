package com.example.laboratorio2mr17040.db
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE

@Entity(
    tableName = "partida",
    primaryKeys = ["idJuego"],
    foreignKeys = [
        ForeignKey(
            entity = JuegoEntity::class,
            parentColumns = ["idJuego"],
            childColumns = ["idJuego"],
            onDelete = CASCADE
        )
    ]
)
data class NotaEntity(
    @ColumnInfo(name = "idJuego")
    val idJuego:Int,
    @ColumnInfo(name="cantPartiPartida")
    val carnetAlumno:Int,
    @ColumnInfo(name = "ganadorPartida")
    val codigoMateria:String,
)