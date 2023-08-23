package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop implements AddReview  {
    private String name;
    private String description;
    private int numDollar;
    private List<Review> reviews;
    public Shop (String name, String description , int numDollar)  {
        this.description = description;
        this.name = name;
        this.numDollar = numDollar;
        this.reviews = new ArrayList<>();
    }
    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    public int getNumDollar(){
        return this.numDollar;
    }
    public List<Review> getReviews(){
        return this.reviews;
    }
    @Override
    public void addReview(Review review) {
        if(!reviews.contains(review)){
            reviews.add(review);
        }
    }


    public String toString(){
        return "Shop\nName : " + name + "\nDescription : " + description + "\nDollars : " + numDollar +"\nReview : " + reviews.toString();
    }
}
