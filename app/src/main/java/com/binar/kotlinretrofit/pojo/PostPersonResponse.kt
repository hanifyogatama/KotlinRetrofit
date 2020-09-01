package com.binar.retrofit.pojo


import com.google.gson.annotations.SerializedName

data class PostPersonResponse(
    @SerializedName("result")
    val result: Result
) {
    data class Result(
        @SerializedName("CreatedAt")
        val createdAt: String, // 2020-08-31T04:49:25.462168526Z
        @SerializedName("DeletedAt")
        val deletedAt: Any, // null
        @SerializedName("first_name")
        val firstName: String, // Wisnu
        @SerializedName("ID")
        val iD: Int, // 108
        @SerializedName("last_name")
        val lastName: String, // Yogatama
        @SerializedName("UpdatedAt")
        val updatedAt: String // 2020-08-31T04:49:25.462168526Z
    )
}