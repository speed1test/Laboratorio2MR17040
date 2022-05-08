package com.example.laboratorio2mr17040.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room

import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.laboratorio2mr17040.db.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Database(
    entities = [
        JuegoEntity::class
    ],
    version = 1,
    exportSchema = false
)
abstract class RegistroNotasDB : RoomDatabase() {
    abstract fun juegoDao(): JuegoDao
    private class JuegoDBCallback(
        private val scope: CoroutineScope
    ) : RoomDatabase.Callback() {
        /*override fun onCreate(db: SupportSQLiteDatabase) {
            super.onCreate(db)
            INSTANCE?.let { database ->
                scope.launch {
                    populateDatabase(database)
                }
            }
        }*/

        suspend fun populateDatabase(db: RegistroNotasDB) {
            // Limpiar base
            db.juegoDao().deleteAll()
            val VAid = listOf(1,2)
            val VAnombre = listOf("Call Of Duty", "Minecraft")
            val VAdescripcion = listOf("Juego 1", "Juego 2")
            val VAcantMinJuego = listOf(1,1)
            val VMcantMaxJuego= listOf(100,100)
            val VMcategoria = listOf(
                "Arcade",
                "Niños"
            )
            for (i in 0..2) {
                db.juegoDao().insert(
                    JuegoEntity(
                        VAid[i],
                        VAnombre[i],
                        VAdescripcion[i],
                        VAcantMinJuego[i],
                        VMcantMaxJuego[i],
                        VMcategoria[i]
                    )
                )
            }
        }
    }
}
