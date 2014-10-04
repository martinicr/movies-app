package com.videoshop.movies;

import org.apache.log4j.PropertyConfigurator;

public class App {


    public static void main(String[] args){
        PropertyConfigurator.configure(App.class.getClassLoader().getResource("log4j.properties"));
        new App().start();
    }

    public void start(){
        MovieList movies = getMovieList();
        MovieFormatter formatter = new MovieFormatter();
        System.out.println(formatter.movieList(movies));
    }

    private MovieList getMovieList(){
        MovieList movies = new MovieList();
        Movie starWars = new Movie("Star Wars");
        Movie titanic = new Movie("Titanic");
        Movie inception = new Movie("Inception");
        movies.add(starWars);
        movies.add(titanic);
        movies.add(inception);

        return movies;
    }

}
