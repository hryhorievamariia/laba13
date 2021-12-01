package com.company;

import java.util.Comparator;

public class MovieWithMaxActorsComparator implements Comparator<Actor> {
   
    @Override
    public int compare(Actor o1, Actor o2) {
        return o1.compareTo(o2);
    }
}
