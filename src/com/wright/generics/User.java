package com.wright.generics;

public class User implements Comparable<User> {

    private int points;

    public User(int _points){
        this.points = _points;
    }

    @Override
    public int compareTo(User other) {
        return points - other.points;
    }

    @Override
    public String toString(){
        return "Points = " + points;
    }
}
