package com.diplom.uedec.teacherapplication.retrofit;

import com.diplom.uedec.teacherapplication.data.entity.ApplicationUser;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by uedec on 10.05.2019.
 */

public interface REST {
    @POST("api/authentication/teacher")
    Call<ApplicationUser> Auth(@Query("email") String email, @Query("password") String password);

    @POST("api/registration/teacher")
    Call<Void> Register(@Body RequestRegisterTeacher requestRegisterStudent);
/*
    @GET("api/events")
    Call<List<EventWithAllMembers>> getAllEvents(@Header("Set-Cookie") String cookies);

    @POST("api/events/subscribe")
    Call<Void> Subscribe(@Body StudentEvent studentEvent, @Header("Set-Cookie") String cookies);

    @POST("api/events/unsubscribe")
    Call<Void> Unsubscribe(@Body StudentEvent studentEvent, @Header("Set-Cookie") String cookies);*/
}
