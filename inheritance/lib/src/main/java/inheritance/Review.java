package inheritance;

import java.util.ArrayList;

public class Review {
    // Requierd Parameters
    private String body;
    private String author;
    private int stars;

    //Optional parameters
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

    private Review(ReviewBuilder reviewBuilder) {
        this.movie =reviewBuilder.movie;
        this.theater = reviewBuilder.theater;
        this.body = reviewBuilder.body;
        this.stars = Math.max(0, Math.min(5, reviewBuilder.stars));
        this.restaurant = reviewBuilder.restaurant;
        this.author = reviewBuilder.author;
        this.shop = reviewBuilder.shop;
        if(reviewBuilder.theater != null) {
            theater.addReview(this);
        } else if (reviewBuilder.shop != null) {
            shop.addReview(this);
        } else {
            restaurant.addReview(this);
        }
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

    public Shop getShop() {
        return shop;
    }

    public Theater getTheater() {
        return theater;
    }

    public String toString() {
        if (theater != null && movie != null) {
            return "Review\nAuthor : " + author + "\nbody : " + body + "\nStars : " + stars + "\nMovie : " + movie;
        } else return "Review\nAuthor : " + author + "\nbody : " + body + "\nStars : " + stars + "\n";
    }

    public static class ReviewBuilder {
        private String body;
        private String author;
        private int stars;

        //Optional parameters
        private Restaurant restaurant;
        private Shop shop;
        private Theater theater;
        private String movie;

        public ReviewBuilder(String body , String author,int stars){
            this.author = author;
            this.body = body;
            this.stars = stars;
        }

        public ReviewBuilder setRestaurant(Restaurant restaurant) {
            this.restaurant = restaurant;
            return this;
        }

        public ReviewBuilder setShop(Shop shop) {
            this.shop = shop;
            return this;
        }

        public ReviewBuilder setTheater(Theater theater) {
            this.theater = theater;
            return this;
        }

        public ReviewBuilder setMovie(String movie) {
            this.movie = movie;
            return this;
        }
        public Review build(){
           return new Review(this);
        }
    }
}
