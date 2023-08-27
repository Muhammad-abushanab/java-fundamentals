package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReviewTest {
    Restaurant res = new Restaurant("Mc Donalds", 4, 25);

    @Test
    void ConstructorParameterValidation_ReturnTrueOnEachProperty() {
        Review rev = new Review.ReviewBuilder("High Rate Food", "Mohammad",5 ).build();
        assertEquals(5, rev.getStars());
        assertEquals("Mohammad", rev.getAuthor());
        assertEquals("High Rate Food", rev.getBody());
    }


    @Test
    void review_HighStarValue_MustNotOverCome_Five_ReturnTrue() {
        Review rev = new Review.ReviewBuilder("High Rate Food", "Mohammad", 20).setRestaurant(res).build();
        assertEquals(5, rev.getStars());
    }

    @Test
    void review_onNegativeStarValues_ReturnZero() {
//        Review rev = new Review(-5, "Mohammad", "High Rate Food", res);
        Review rev = new Review.ReviewBuilder("High Rate Food" , "Mohammad",-5).setRestaurant(res).build();
        assertEquals(0, rev.getStars());
    }

    @Test
    void review_toString_ReturnReviewInStringFormat(){
        Review rev = new Review.ReviewBuilder("High Rate Food" , "Mohammad",5).setRestaurant(res).build();
        assertEquals("Review\nAuthor : Mohammad\nbody : High Rate Food\nStars : 5\n",rev.toString());
    }
    @Test
    void review_TheaterWithMovieComment_ReturnReviewWithMovie(){
        Theater th = new Theater("Taj");
//        Review rev = new Review(5,"Mohammad","Amazing Theater",th,"Interstellar");
        Review rev = new Review.ReviewBuilder("Amazing Theater" , "Mohammad" , 5).setMovie("Interstellar").setTheater(th).build();
        assertEquals("Review\nAuthor : Mohammad\nbody : Amazing Theater\nStars : 5\nMovie : Interstellar",rev.toString());
    }
    @Test
    void review_TheaterWithNoMovieComment_ReturnReviewWithoutMovieComment(){
        Theater th = new Theater("Taj");
        Review rev = new Review.ReviewBuilder("Amazing Theater" , "Mohammad" , 5).setTheater(th).build();
        assertEquals("Review\nAuthor : Mohammad\nbody : Amazing Theater\nStars : 5\n",rev.toString());
    }

    @Test
    void review_Shop_ReturnReview(){
        Shop shop = new Shop("City Center","Computer Hardware And More",45);
//        Review rev = new Review(2,"Mohammad","Best Computer Hardware",shop);
        Review rev = new Review.ReviewBuilder("Best Computer Hardware","Mohammad",2).setShop(shop).build();
        assertEquals("Review\nAuthor : Mohammad\nbody : Best Computer Hardware\nStars : 2\n",rev.toString());
    }
}
