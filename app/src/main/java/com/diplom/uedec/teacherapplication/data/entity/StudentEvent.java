package com.diplom.uedec.teacherapplication.data.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.support.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import static android.arch.persistence.room.ForeignKey.CASCADE;

/**
 * Created by uedec on 10.05.2019.
 */

@Entity( primaryKeys = {"studentId","eventId"},foreignKeys =
        {
                @ForeignKey(entity = ApplicationUser.class,parentColumns = "Id",childColumns = "studentId", onDelete = CASCADE),
                @ForeignKey(entity = Event.class,parentColumns = "Id", childColumns = "eventId", onDelete = CASCADE)
        })
public class StudentEvent {
    @SerializedName("ApplicationUserId")
    @Expose
    @NonNull
    private final String studentId;
    @SerializedName("EventId")
    @Expose
    private final int eventId;
    public StudentEvent(String studentId, int eventId)
    {
        this.studentId=studentId;
        this.eventId=eventId;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getEventId() {
        return eventId;
    }
}