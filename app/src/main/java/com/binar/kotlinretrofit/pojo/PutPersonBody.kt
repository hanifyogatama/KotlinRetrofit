package com.binar.retrofit.pojo


import com.google.gson.annotations.SerializedName

data class PutPersonBody(
    @SerializedName("first_name")
    val firstName: String, // Wisnu
    @SerializedName("last_name")
    val lastName: String // Yoga
)