package com.diplom.uedec.teacherapplication.data.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.diplom.uedec.teacherapplication.data.entity.StudentEvent;

import java.util.List;

/**
 * Created by uedec on 10.05.2019.
 */

@Dao
public interface StudentEventDao {
    @Query("SELECT * FROM StudentEvent")
    List<StudentEvent> getAll();

    @Query("SELECT * FROM StudentEvent WHERE studentId = :studentId")
    List<StudentEvent>getByStudentId(String studentId);

    @Query("SELECT * FROM StudentEvent WHERE eventId = :eventId")
    List<StudentEvent>getByLessonId(int eventId);

    @Insert
    void insert(StudentEvent studentEvent);
    @Delete
    void delete(StudentEvent studentEvent);
}
