package com.company;

import java.util.*;

public class DataBase {

    private Set<Movie> allmovies = new HashSet<>();

    private  Set<Actor> allactors = new HashSet<>();

    public  void addMovie(Movie movie) {allmovies.add(movie);}

    public  void addActor(Actor actor) {allactors.add(actor);}

    public  Set<Movie> getMovies() {return allmovies;}

    public  Set<Actor> getActors() {return allactors;}

    public  Set<Actor> noMovie() {
        Set<Actor> resultSet = new HashSet<>();

        Iterator actorIterator = getActors().iterator();

            while (actorIterator.hasNext()) {

                Actor actor = (Actor) actorIterator.next();

                Iterator movieIterator = getMovies().iterator();
                boolean flag = false;
                while (movieIterator.hasNext()) {
                    Movie movie = (Movie) movieIterator.next();

                    if (movie.getActors().contains(actor)) {
                        flag = true;
                        break;
                    }
                }
                if (flag == false) {
                    resultSet.add(actor);
                }
            }
            return resultSet;
    }


    public Set<Actor> getActorsWhoWorkTogether (Actor actor) {
        Set<Actor> resultSet = new HashSet<>();

        for (Iterator<Movie> movieIterator = allmovies.iterator(); movieIterator.hasNext(); ) {
            Movie someMovie = movieIterator.next();
            if (someMovie.getActors().contains(actor)) {
                for (Iterator<Actor> actorIterator = someMovie.getActors().iterator(); actorIterator.hasNext(); ) {
                    Actor nextActor = actorIterator.next();
                    {
                      if (!(nextActor.equals(actor) || resultSet.contains(nextActor))) resultSet.add(nextActor);
                    }
                }
            }
        }
        return resultSet;
    }


    public Movie getMoviesWithTheLargestNumberOfActors() {
        Movie maxActors = allmovies.iterator().next();
        for (Movie someMovie : allmovies) {
            if (someMovie.getActors().size() > maxActors.getActors().size()) {
                maxActors = someMovie;
            }
        }

        
        return maxActors;
    }

    public Actor getActorWithTheLargestNumberOfMovies(Map<Actor, HashSet<Movie>> map) throws ActorOrMoviesNotReadyException  {
        Set<Map.Entry<Actor,HashSet<Movie>>> entrySet=map.entrySet();

        Actor maxMovies = null;
        HashSet<Movie> tempMovie = new HashSet<Movie>();
        for (Map.Entry<Actor,HashSet<Movie>> pair : entrySet) {
            if ((pair.getKey() != null) && (pair.getValue() != null)) {
                if (pair.getValue().size() > tempMovie.size()){
                    tempMovie = pair.getValue();
                    maxMovies = pair.getKey();
                }
            } else {
                throw new ActorOrMoviesNotReadyException("Актер или список фильмов с его участием задан некорректно, проверьте!");
            }

        }
        return maxMovies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataBase dataBase = (DataBase) o;
        return Objects.equals(allmovies, dataBase.allmovies) && Objects.equals(allactors, dataBase.allactors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allmovies, allactors);
    }
}






