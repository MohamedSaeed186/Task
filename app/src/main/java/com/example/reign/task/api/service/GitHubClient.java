package com.example.reign.task.api.service;

import com.example.reign.task.api.model.GitHubRepo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Reign on 28-Sep-17.
 */

public interface GitHubClient {
   @GET ("/users/{users}/repo")
   Call<List<GitHubRepo>> reposForUser(@Path("users") String user);
}
