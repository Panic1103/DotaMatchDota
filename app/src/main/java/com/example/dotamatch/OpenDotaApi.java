package com.example.dotamatch;

import com.example.dotamatch.Post.Post;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface OpenDotaApi {
    @GET("/matches/{match_id}")
    public Call<Post> getPostWithMatchId(@Path("match_id") int matchId);
}
