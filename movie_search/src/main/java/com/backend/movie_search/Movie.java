package com.backend.movie_search;

public class Movie {

    private String title;
    private String releaseDate;
    private String overview;
    private double ratings;

    private String posterPath;

    public Movie(String title, String releaseDate, String overview, double ratings, String posterPath) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.overview = overview;
        this.ratings = ratings;
        this.posterPath = posterPath;
    }

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public double getRatings() {
        return ratings;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }
}