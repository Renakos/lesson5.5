package com.example.lesson54.data.remote.apiservices

import com.example.lesson54.data.model.CharactersResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

private const val CHARACTERS_END_POINT = "api/character"

interface RickAndMortyApiService {

    @GET(CHARACTERS_END_POINT)
    fun getCharacters(@Query("name") name: String,@Query("status") status: String,@Query("species") species : String): Call<CharactersResponse>

}
