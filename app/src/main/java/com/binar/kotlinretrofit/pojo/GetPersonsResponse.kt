package com.binar.kotlinretrofit.pojo


import com.google.gson.annotations.SerializedName

data class GetPersonsResponse(
    @SerializedName("count")
    val count: Int,
    @SerializedName("result")
    val result: List<Result>
) {
    data class Result(
        @SerializedName("CreatedAt")
        val createdAt: String,
        @SerializedName("DeletedAt")
        val deletedAt: Any,
        @SerializedName("first_name")
        val firstName: String,
        @SerializedName("ID")
        val iD: Int,
        @SerializedName("last_name")
        val lastName: String,
        @SerializedName("UpdatedAt")
        val updatedAt: String
    )
}