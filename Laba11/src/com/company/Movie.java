package com.company;

import java.util.*;

public class Movie {
    private String name;

    private Set<Actor> actors = new HashSet<Actor>();
    
    public Movie(String name) {
        this.name = name;
    }

    public String getName() {return name;}

    public Set<Actor> getActors() { return this.actors; }

    public void addActor(Actor actor) { this.actors.add(actor); }

    @Override
    public String toString() {
        return name;
    }
}

