package ru.myitschool.retrofit.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import ru.myitschool.retrofit.PostModel;

import java.util.List;

public interface FlowerApi {
    @GET("/projects/Feeds/flowers.json")
    Call<List<PostModel>> getData(@Query("name") String resourceName, @Query("num") int count);
}
