package com.arthlimchiu.mymovies

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface Api {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "6f69d45e4cfbba1a8cd274b29616477f",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

}