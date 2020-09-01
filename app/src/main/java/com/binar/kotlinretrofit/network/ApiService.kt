package com.binar.kotlinretrofit.network

import com.binar.kotlinretrofit.pojo.DeletePersonResponse
import com.binar.kotlinretrofit.pojo.GetPersonsResponse
import com.binar.kotlinretrofit.pojo.PostPersonBody
import com.binar.retrofit.pojo.PostPersonResponse
import com.binar.retrofit.pojo.PutPersonResponse
import retrofit2.Call
import retrofit2.http.*


interface ApiService{
    @GET("persons")
    fun getAllPersons(): Call<GetPersonsResponse>

    @POST("persons")
    fun addPersons(@Body postPersonBody: PostPersonBody): Call<PostPersonResponse>

    @PUT("person/{id}")
    fun updatePerson(@Path("id") id: Int, @Body putPersonBody: PostPersonBody): Call<PutPersonResponse>

    @DELETE("person/{id}")
    fun deletePerson(@Path("id") id: Int): Call<DeletePersonResponse>
}
