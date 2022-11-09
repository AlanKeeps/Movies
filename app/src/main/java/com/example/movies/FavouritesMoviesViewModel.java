package com.example.movies;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class FavouritesMoviesViewModel extends AndroidViewModel {

    private final MovieDao movieDao;

    public FavouritesMoviesViewModel(@NonNull Application application) {
        super(application);
        movieDao = MovieDatabase.getInstance(application).movieDao();

    }

    public LiveData<List<Movie>> getMovies() {
        return movieDao.getAllFavouriteMovies();
    }
}
