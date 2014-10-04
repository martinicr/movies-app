package com.videoshop.movies;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;

public class MovieListTest {

    MovieList movieList;

    @Before
    public void setUp() throws Exception{
        movieList = new MovieList();
    }

    @Test
    public void emptyListSize() throws Exception{
        assertThat(movieList.size(), is(0));
    }

    @Test
    public void sizeAfterAddingOneMovie() throws Exception{
        Movie starWars = new Movie("Star Wars");
        movieList.add(starWars);
        assertThat(movieList.size(), is(1));
    }

    @Test
    public void sizeAfterAddingTwoMovies() throws Exception{
        Movie starWars = new Movie("Star Wars");
        Movie titanic = new Movie("Titanic");
        movieList.add(starWars);
        movieList.add(titanic);
        assertThat(movieList.size(), is(2));
    }

    @Test
    public void containsMovie() throws Exception{
        Movie starWars = new Movie("Star Wars");
        Movie titanic = new Movie("Titanic");
        Movie cars = new Movie("Cars");
        movieList.add(starWars);
        movieList.add(titanic);
        assertThat(movieList.contains(starWars), is(true));
        assertThat(movieList.contains(titanic), is(true));
        assertThat(movieList.contains(cars), is(false));
    }

}
