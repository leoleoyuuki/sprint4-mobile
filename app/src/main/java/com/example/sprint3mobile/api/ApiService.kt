package com.example.sprint3mobile.api

import com.example.sprint3mobile.data.Company
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {
    @GET("/empresas")
    fun getCompanies(): Call<List<Company>>

    @POST("/empresas")
    fun createCompany(@Body company: Company): Call<ResponseBody>

}
