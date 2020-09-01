package com.binar.retrofit.pojo


import com.google.gson.annotations.SerializedName

data class PutPersonResponse(
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("result")
    val result: String // successfully updated data
) {
    data class Data(
        @SerializedName("CreatedAt")
        val createdAt: String, // 2020-08-31T04:49:25.462169Z
        @SerializedName("DeletedAt")
        val deletedAt: Any, // null
        @SerializedName("first_name")
        val firstName: String, // Wisnu
        @SerializedName("ID")
        val iD: Int, // 108
        @SerializedName("last_name")
        val lastName: String, // Yoga
        @SerializedName("UpdatedAt")
        val updatedAt: String // 2020-08-31T04:54:35.657619133Z
    )
}