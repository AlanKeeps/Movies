package com.example.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;

public interface ApiService {

    @GET("movie?token=G0GS1WP-FQ14QY9-MHM51EH-AV05TEH&field=rating.kp&search=7-10&sortField=votes.kp&sortType=-1&page2&limit=10")
    Single<MovieResponse> loadMovies();
}
