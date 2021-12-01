package com.company;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        DataBase db = new DataBase();

        Movie movie1 = new Movie("Один дома");
        Movie movie2 = new Movie("Гарри Поттер");
        Movie movie3 = new Movie("Иллюзия обмана 2");
        Movie movie4 = new Movie("Веном 2");
        Movie movie5 = new Movie("Пираты Карибского моря");
        Movie movie6 = new Movie("Алиса в Зазеркалье");

        Actor actor1 = new Actor("Калкин");
        Actor actor2 = new Actor("Эмма Уотсон");
        Actor actor3 = new Actor("Дэниель Рэдклифф");
        Actor actor4 = new Actor("Вуди Харрельсон");
        Actor actor5 = new Actor("Марк Руффало");
        Actor actor6 = new Actor("Том Харди");
        Actor actor7 = new Actor("Наоми Харрис");
        Actor actor8 = new Actor("Джонни Депп");
        Actor actor9 = new Actor("Энн Хэтэуей");
        Actor actor10 = new Actor("Алан Рикман");
        Actor actor11 = new Actor("Джейсон Стейтем");
        Actor actor12 = new Actor("Бред Питт");

        db.addMovie(movie1);
        db.addMovie(movie2);
        db.addMovie(movie3);
        db.addMovie(movie4);
        db.addMovie(movie5);
        db.addMovie(movie6);
        //db.addMovie(null);

        db.addActor(actor1);
        db.addActor(actor2);
        db.addActor(actor3);
        db.addActor(actor4);
        db.addActor(actor5);
        db.addActor(actor6);
        db.addActor(actor7);
        db.addActor(actor8);
        db.addActor(actor9);
        db.addActor(actor10);
        db.addActor(actor11);
        db.addActor(actor12);

        movie1.addActor(actor1);
        movie2.addActor(actor2);
        movie2.addActor(actor3);
        movie3.addActor(actor3);
        movie3.addActor(actor4);
        movie3.addActor(actor5);
        movie3.addActor(actor7);
        movie4.addActor(actor4);
        movie4.addActor(actor6);
        movie4.addActor(actor7);
        movie5.addActor(actor7);
        movie5.addActor(actor8);
        movie6.addActor(actor8);
        movie6.addActor(actor9);
        movie6.addActor(actor10);

        Map<Actor, HashSet<Movie>> map = new HashMap<Actor, HashSet<Movie>>();
        HashSet<Movie> movies1 = new HashSet<Movie>();
        HashSet<Movie> movies2 = new HashSet<Movie>();
        HashSet<Movie> movies3 = new HashSet<Movie>();
        HashSet<Movie> movies4 = new HashSet<Movie>();
        HashSet<Movie> movies5 = new HashSet<Movie>();
        HashSet<Movie> movies6 = new HashSet<Movie>();
        HashSet<Movie> movies7 = new HashSet<Movie>();
        HashSet<Movie> movies8 = new HashSet<Movie>();
        HashSet<Movie> movies9 = new HashSet<Movie>();
        HashSet<Movie> movies10 = new HashSet<Movie>();
        HashSet<Movie> movies11 = new HashSet<Movie>();
        HashSet<Movie> movies12 = new HashSet<Movie>();
        movies1.add(movie1);
        movies2.add(movie2);
        movies2.add(movie3);
        movies3.add(movie3);
        movies3.add(movie4);
        movies4.add(movie4);
        movies5.add(movie3);
        movies6.add(movie4);
        movies7.add(movie3);
        movies7.add(movie4);
        movies7.add(movie5);
        movies8.add(movie5);
        movies8.add(movie6);
        movies9.add(movie6);
        movies10.add(movie6);
//        movies11.add(null);
//        movies12.add(null);


        map.put(actor1, movies1);
        map.put(actor2, movies2);
        map.put(actor3, movies3);
        map.put(actor4, movies4);
        map.put(actor5, movies5);
        map.put(actor6, movies6);
        map.put(actor7, movies7);
        map.put(actor8, movies8);
        map.put(actor9, movies9);
        map.put(actor10, movies10);
        map.put(actor11, movies11);
        map.put(actor12, movies12);
        //map.put(null, movies1);

        try {
            System.out.println(db.noMovie());
        } catch (NullPointerException e1) {
            System.err.println("Oшибка не задано имя актера или фильма!");
            e1.printStackTrace();
        }

        //System.out.println(db.getActorsWhoWorkTogether(actor4));
        //System.out.println(db.getMoviesWithTheLargestNumberOfActors());
        try {
        System.out.println(db.getActorWithTheLargestNumberOfMovies(map));
    } catch (ActorOrMoviesNotReadyException e) {
            System.out.println(e.getMessage());
           // System.err.println("Неверно задан актер или список фильмов с его участием!");
        }

        }
}