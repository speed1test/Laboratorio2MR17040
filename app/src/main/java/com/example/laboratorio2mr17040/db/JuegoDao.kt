package com.example.laboratorio2mr17040.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface JuegoDao {
    @Query("Select * from juego")
    fun getAll():LiveData<List<JuegoEntity>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(juego: JuegoEntity)

    @Update
    suspend fun update(juego: JuegoEntity)

    @Delete
    suspend fun delete(juego: JuegoEntity)

    @Query("Delete from juego")
    suspend fun deleteAll()

}