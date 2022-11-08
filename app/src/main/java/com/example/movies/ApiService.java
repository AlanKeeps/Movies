package com.example.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("movie?token=G0GS1WP-FQ14QY9-MHM51EH-AV05TEH&field=rating.kp&search=7-10&sortField=votes.kp&sortType=-1&limit=30")
    Single<MovieResponse> loadMovies(@Query("page") int page);

    @GET("movie?token=G0GS1WP-FQ14QY9-MHM51EH-AV05TEH&field=id")
    Single<TrailerResponse> loadTrailers(@Query("search") int id);

    @GET("review?token=G0GS1WP-FQ14QY9-MHM51EH-AV05TEH&field=movieId")
    Single<ReviewResponse> loadReviews(@Query("search") int id);
}
