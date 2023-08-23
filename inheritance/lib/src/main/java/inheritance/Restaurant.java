package inheritance;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Restaurant implements AddReview {
    private String name;
    private double rate;
    private int price;

    private List<Review> reviews;

    public Restaurant(String name, int rate, int price) {
        this.name = name;
        this.price = price;
        this.rate =Math.max(0, Math.min(5, rate));
        this.reviews = new ArrayList<>();
    }

    public double getRate() {
        return this.rate;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public List<Review> getReviews() {
        return this.reviews;
    }


    @Override
    public void addReview(Review review) {
        if (!reviews.contains(review)) {
            reviews.add(review);
            updateAverageStars();
        }
    }


    private void updateAverageStars() {
        DecimalFormat df = new DecimalFormat("0.0");
        double totalStars = 0;
        for (Review review : reviews) {
            totalStars += review.getStars();
        }
        rate = Double.parseDouble(df.format(totalStars / reviews.size()));
    }

    public String toString() {
        return "Restaurant\nName : " + name + "\nprice : " + price + "\nRate : " + rate + "\nReviews : " + reviews.toString();
    }
}
