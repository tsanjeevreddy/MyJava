package com.dts.core.features.comparable;

public class Movie implements Comparable<Movie>{
    private double rating;
    private String name;
    private int year;



    public Movie(double rating, String name, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

    // sort movies by year
    @Override
    public int compareTo(Movie m) {
        return this.year-m.year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "rating=" + rating +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
