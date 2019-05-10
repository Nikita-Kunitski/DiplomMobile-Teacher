package com.diplom.uedec.teacherapplication.data.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.diplom.uedec.teacherapplication.data.entity.Lesson;

import java.util.List;

/**
 * Created by uedec on 10.05.2019.
 */

@Dao
public interface LessonDao {
    @Query("Select * from lesson")
    List<Lesson> getAll();

    @Query("SELECT * FROM lesson WHERE Id = :id")
    Lesson getById(int id);

    @Insert
    void insert (Lesson lesson);

    @Update
    void update(Lesson lesson);

    @Delete
    void delete(Lesson lesson);
}
