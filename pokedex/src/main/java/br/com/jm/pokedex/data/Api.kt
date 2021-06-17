package br.com.jm.pokedex.data

import br.com.jm.pokedex.data.entities.Pokemon
import retrofit2.http.GET
import retrofit2.http.Path

interface Api {
    @GET("/pokemon/{id}")
    suspend fun getPokemonById(@Path("id")id: Int): Pokemon
}