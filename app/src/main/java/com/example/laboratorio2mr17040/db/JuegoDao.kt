package com.example.laboratorio2mr17040.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface JuegoDao {
    @Query("Select * from juego")
    fun getAll():LiveData<List<AlumnoEntity>>

    /*@Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(alumno: AlumnoEntity)

    @Update
    suspend fun update(alumno: AlumnoEntity)

    @Delete
    suspend fun delete(alumno: AlumnoEntity)

    @Query("Delete from alumno")
    suspend fun deleteAll()*/

}