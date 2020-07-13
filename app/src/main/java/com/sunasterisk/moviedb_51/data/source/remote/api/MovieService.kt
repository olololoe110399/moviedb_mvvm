package com.sunasterisk.moviedb_51.data.source.remote.api

import com.sunasterisk.moviedb_51.data.model.Movie
import com.sunasterisk.moviedb_51.data.source.remote.response.GenresResponse
import com.sunasterisk.moviedb_51.data.source.remote.response.MoviesResponse
import com.sunasterisk.moviedb_51.utils.Constant
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieService {

    @GET("genre/movie/list")
    fun getGenres(): Observable<GenresResponse>

    @GET("movie/{Category}")
    fun getMoviesByCategory(
        @Path("Category") type: String,
        @Query("page") countPage: Int,
        @Query("language") language: String = Constant.BASE_LANGUAGE
    ): Observable<MoviesResponse>

    @GET("movie/{movieId}?append_to_response=credits,videos")
    fun getMovieDetails(
        @Path("movieId") movieId: Int,
        @Query("language") language: String = Constant.BASE_LANGUAGE
    ): Observable<Movie>

    @GET("discover/movie")
    fun getMoviesByGenresID(
        @Query("with_genres") query: String,
        @Query("page") page: Int,
        @Query("language") language: String = Constant.BASE_LANGUAGE
    ): Observable<MoviesResponse>

    @GET("discover/movie")
    fun getMoviesCastID(
        @Query("with_cast") query: String,
        @Query("page") page: Int,
        @Query("language") language: String = Constant.BASE_LANGUAGE
    ): Observable<MoviesResponse>

    @GET("discover/movie")
    fun getMoviesByProduceID(
        @Query("with_companies") query: String,
        @Query("page") page: Int,
        @Query("language") language: String = Constant.BASE_LANGUAGE
    ): Observable<MoviesResponse>

    @GET("search/movie")
    fun getMoviesByQuery(
        @Query("query") query: String,
        @Query("page") page: Int,
        @Query("language") language: String = Constant.BASE_LANGUAGE
    ): Observable<MoviesResponse>
}
