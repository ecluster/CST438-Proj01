package com.example.cst438proj01;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;
@Dao
public interface savedJobsDAO {
    @Insert
    void insert(savedJob... savedJobs);

    @Update
    void update(savedJob... savedJobs);

    @Delete
    void delete(savedJob... savedJobs);

    @Query(" SELECT * FROM saved_jobs_table")
    LiveData<List<savedJob>> getjobs();


    @Query(" SELECT * FROM  saved_jobs_table WHERE mUserID= :userId ")
    LiveData<List<savedJob>> getjobsbyid(int userId);
}

