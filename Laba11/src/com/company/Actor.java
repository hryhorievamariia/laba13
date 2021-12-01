package com.company;

import java.util.HashSet;
import java.util.Set;

public class Actor implements Comparable<Actor> {
    private String name;

    private Set<Movie> movies = new HashSet<Movie>();

    public Actor(String name) {this.name = name;}

    public void addMovie(Movie movie) { this.movies.add(movie); }

    public Set<Movie> getMovies() { return this.movies; }

    public String getName() {return name;}

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Actor o) {
        String str1 = this.name;
        String str2 = o.name;
        return str1.compareTo(str2);
    }
    
}
