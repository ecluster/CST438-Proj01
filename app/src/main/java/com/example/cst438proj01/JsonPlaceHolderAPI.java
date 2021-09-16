package com.example.cst438proj01;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface JsonPlaceHolderAPI {

    // seach for jobs
    @Headers({
            "Host: data.usajobs.gov",
            "User-Agent: ",
            "Authorization-Key: "
    })
    @GET("search")
    Call<Job> getJob(
            @Query("Keyword") String keyword,
            @Query("LocationName") String locationName);

    // get hiring paths for all jobs
    @GET("codelist/hiringpaths")
    Call<HirePath> getHirePath();

    // get job schedules for all jobs (part-time, full-time, ect...)
    @GET("codelist/positionscheduletypes")
    Call<PositionSchedule> getPositionSchedule();
    //Call<List<Job>> getJob(@Query("Keyword") String keyword);
}
