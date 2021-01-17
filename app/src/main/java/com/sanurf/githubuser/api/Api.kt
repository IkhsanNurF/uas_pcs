package com.sanurf.githubuser.api

import com.sanurf.githubuser.data.model.DetailUserResponse
import com.sanurf.githubuser.data.model.User
import com.sanurf.githubuser.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 5eee003e33c1e0fa2541834a09d232dc5520cb64")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 5eee003e33c1e0fa2541834a09d232dc5520cb64")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 5eee003e33c1e0fa2541834a09d232dc5520cb64")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 5eee003e33c1e0fa2541834a09d232dc5520cb64")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}