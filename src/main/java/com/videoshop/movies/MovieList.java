package com.videoshop.movies;


import java.util.ArrayList;
import java.util.List;

public class MovieList {

    private List<Movie> movies;

    public MovieList(){
        this.movies = new ArrayList<>();
    }

    public void add(Movie movie){
        movies.add(movie);
    }

    public int size(){
        return movies.size();
    }

    public boolean contains(Movie movie){
        return movies.contains(movie);
    }

    public List<Movie> list(){
        return this.movies;
    }

}
