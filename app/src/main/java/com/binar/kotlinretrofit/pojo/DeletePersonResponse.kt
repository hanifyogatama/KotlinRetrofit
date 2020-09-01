package com.binar.kotlinretrofit.pojo


import com.google.gson.annotations.SerializedName

data class DeletePersonResponse(
    @SerializedName("result")
    val result: String // Data deleted successfully
)