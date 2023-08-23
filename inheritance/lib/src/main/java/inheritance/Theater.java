package inheritance;

import org.apache.commons.math3.analysis.function.Add;

import java.util.ArrayList;
import java.util.List;

public class Theater implements AddReview {
    private String name;
    private List<String> movies;
    private List<Review> reviews;

    public Theater(String name ) {
        this.name = name;
        this.movies = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }
    public String getName(){
        return this.name;
    }
    public List<String> getMovies(){
        return  this.movies;
    }
    public List<Review> getReviews(){
        return this.reviews;
    }
    public void addMovie(String movie) {
        this.movies.add(movie);
    }
    public boolean removeMovie(String movie) {
        return this.movies.remove(movie);
    }
    @Override
    public void addReview(Review review){
        if(!reviews.contains(review)){
            reviews.add(review);
        }
    }
    public String toString(){
        return "Theater\nName : " + name + "\nMovies : " + movies.toString() + "\nReviews : " + reviews.toString();
    }
}
