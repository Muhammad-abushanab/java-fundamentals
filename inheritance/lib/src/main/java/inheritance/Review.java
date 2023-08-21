package inheritance;

import java.util.ArrayList;

public class Review {
    private String body;
    private String author;
    private int stars;
    private Restaurant restaurant;

    public Review(int stars , String author , String body,Restaurant res){
        this.author = author;
        this.body = body;
        this.stars = Math.max(0, Math.min(5, stars));
        this.restaurant = res;
        res.addReview(this);
    }
    public String getBody(){
        return this.body;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getStars(){
        return this.stars;
    }
    public Restaurant getRestaurant(){
        return restaurant;
    }
    public String toString() {
        return "Review\nAuthor : " + author +"\nbody : " + body +"\nStars : " + stars +"\n";
    }
}
