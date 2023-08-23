package inheritance;

import java.util.ArrayList;

public class Review {
    private String body;
    private String author;
    private int stars;

    private Restaurant restaurant;
    private Shop shop;
    private Theater theater;
    private String movie;

    public Review(int stars, String author, String body, Restaurant res) {
        this.author = author;
        this.body = body;
        this.stars = Math.max(0, Math.min(5, stars));
        this.restaurant = res;
        res.addReview(this);
    }

    public Review(int stars, String author, String body, Shop shop) {
        this.author = author;
        this.body = body;
        this.stars = Math.max(0, Math.min(5, stars));
        this.shop = shop;
        shop.addReview(this);
    }

    public Review(int stars, String author, String body, Theater theater, String movie) {
        this.author = author;
        this.body = body;
        this.stars = Math.max(0, Math.min(5, stars));
        this.theater = theater;
        this.movie = movie;
        theater.addReview(this);
    }

    public Review(int stars, String author, String body, Theater theater) {
        this.author = author;
        this.body = body;
        this.stars = Math.max(0, Math.min(5, stars));
        this.theater = theater;
        theater.addReview(this);
    }

    public String getBody() {
        return this.body;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getStars() {
        return this.stars;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public String toString() {
        if(theater!= null && movie != null){
            return "Review\nAuthor : " + author + "\nbody : " + body + "\nStars : " + stars + "\nMovie : " + movie;
        }
        else return "Review\nAuthor : " + author + "\nbody : " + body + "\nStars : " + stars + "\n";
    }
}
