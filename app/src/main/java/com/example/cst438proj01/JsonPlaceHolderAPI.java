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

    @Headers({
            "Host: data.usajobs.gov",
            "User-Agent: ecluster@csumb.edu",
            "Authorization-Key: 6Qlpg4hAKcCLw4ZmZO1cEmRnEiGIAZJGpq1cPz1YPwY="
    })
    @GET("search")
    Call<List<Job>> getJob(@Query("Keyword") String keyword);
}
