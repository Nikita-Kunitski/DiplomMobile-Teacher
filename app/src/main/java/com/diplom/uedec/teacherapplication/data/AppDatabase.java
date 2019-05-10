package com.diplom.uedec.teacherapplication.data;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.diplom.uedec.teacherapplication.data.dao.ApplicationUserDao;
import com.diplom.uedec.teacherapplication.data.dao.AuditoriumDao;
import com.diplom.uedec.teacherapplication.data.dao.AuditoriumTypeDao;
import com.diplom.uedec.teacherapplication.data.dao.EventDao;
import com.diplom.uedec.teacherapplication.data.dao.LessonDao;
import com.diplom.uedec.teacherapplication.data.dao.StudentEventDao;
import com.diplom.uedec.teacherapplication.data.dao.TeacherLessonDao;
import com.diplom.uedec.teacherapplication.data.entity.ApplicationUser;
import com.diplom.uedec.teacherapplication.data.entity.Auditorium;
import com.diplom.uedec.teacherapplication.data.entity.AuditoriumType;
import com.diplom.uedec.teacherapplication.data.entity.Event;
import com.diplom.uedec.teacherapplication.data.entity.Lesson;
import com.diplom.uedec.teacherapplication.data.entity.StudentEvent;
import com.diplom.uedec.teacherapplication.data.entity.TeacherLesson;

/**
 * Created by uedec on 10.05.2019.
 */

@Database(entities = {AuditoriumType.class, Auditorium.class, Lesson.class, ApplicationUser.class, Event.class, StudentEvent.class, TeacherLesson.class},version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract AuditoriumTypeDao auditoriumTypeDao();
    public abstract AuditoriumDao auditoriumDao();
    public abstract LessonDao lessonDao();
    public abstract ApplicationUserDao applicationUserDao();
    public abstract EventDao eventDao();
    public abstract StudentEventDao studentEventDao();
    public abstract TeacherLessonDao teacherLessonDao();
}
