package com.diplom.uedec.teacherapplication.data.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.support.annotation.NonNull;

import static android.arch.persistence.room.ForeignKey.CASCADE;

/**
 * Created by uedec on 10.05.2019.
 */

@Entity(primaryKeys = {"teacherId","lessonId"},
        foreignKeys = {
                @ForeignKey(entity = ApplicationUser.class,parentColumns = "Id",childColumns = "teacherId",onDelete = CASCADE),
                @ForeignKey(entity = Lesson.class,parentColumns = "Id",childColumns = "lessonId",onDelete = CASCADE)})
public class TeacherLesson {
    @NonNull
    private final String teacherId;
    @NonNull
    private final int lessonId;
    public TeacherLesson(String teacherId, int lessonId)
    {
        this.lessonId=lessonId;
        this.teacherId=teacherId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public int getLessonId() {
        return lessonId;
    }
}
