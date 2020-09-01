package com.binar.kotlinretrofit

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import android.widget.Toast
import com.binar.kotlinretrofit.network.ApiClient
import com.binar.kotlinretrofit.pojo.GetPersonsResponse
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private lateinit var progressDialog : ProgressDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        progressDialog = ProgressDialog(this)
        progressDialog.setMessage("Please wait...")

    }

    override fun onResume() {
        super.onResume()
        getPerson()
    }

    fun getPerson() {
        progressDialog.show()
        ApiClient.apiService.getAllPersons().enqueue(object : Callback<GetPersonsResponse> {
            override fun onResponse(
                call: Call<GetPersonsResponse>,
                response: Response<GetPersonsResponse>
            ) {
                response.body()?.result?.let {
                    val adapter = PersonAdapter(it)
                    recyclerView.adapter = adapter
                }

                progressDialog.dismiss()
            }

            override fun onFailure(call: Call<GetPersonsResponse>, t: Throwable) {
                Toast.makeText(
                    this@MainActivity,
                    "Error : ${t.localizedMessage}",
                    Toast.LENGTH_LONG
                ).show()

                progressDialog.dismiss()
            }

        })
    }
}