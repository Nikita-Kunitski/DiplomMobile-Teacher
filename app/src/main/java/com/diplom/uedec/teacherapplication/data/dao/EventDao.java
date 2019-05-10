package com.diplom.uedec.teacherapplication.data.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.diplom.uedec.teacherapplication.data.entity.Event;
import com.diplom.uedec.teacherapplication.data.entity.EventWithStudents;

import java.util.List;

/**
 * Created by uedec on 10.05.2019.
 */

@Dao
public interface EventDao {
    @Query("SELECT * FROM event")
    List<Event> getAll();

    @Query("SELECT * FROM event WHERE Id = :id")
    Event getById(int id);

    @Insert
    void insert (Event event);

    @Update
    void update(Event event);

    @Delete
    void delete(Event event);

    @Query("Select * from event")
    List<EventWithStudents> getEventWithStudents();


}
