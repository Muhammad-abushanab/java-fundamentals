package inheritance;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TheaterTest {
    @Test
    void theater_ToString_ReturnStringInRightOrder() {
        Theater theater = new Theater("Taj");
        Review rev = new Review(2, "Mohammad", "Great", theater);
        String movie = "London has fallen";
        theater.addMovie(movie);
        assertEquals("Theater\nName : Taj\nMovies : [London has fallen]\nReviews : [Review\nAuthor : Mohammad\nbody : Great\nStars : 2\n]", theater.toString());
    }

    @Test
    void theater_ToStringWithMovieReview_ReturnStringInRightOrder() {
        Theater theater = new Theater("Taj");
        Review rev = new Review(2, "Mohammad", "Great", theater, "Amazing spider Man");
        String movie = "London has fallen";
        theater.addMovie(movie);
        assertEquals("Theater\nName : Taj\nMovies : [London has fallen]\nReviews : [Review\nAuthor : Mohammad\nbody : Great\nStars : 2\nMovie : Amazing spider Man]", theater.toString());
    }

    @Test
    void theater_ToStringWith_DifferentReviews_ReturnStringInRightOrder() {
        Theater theater = new Theater("Taj");
        Review rev = new Review(2, "Mohammad", "Great", theater, "Amazing spider Man");
        Review rev2 = new Review(5, "ASAC", "Amazing Theater", theater);
        String movie = "London has fallen";
        theater.addMovie(movie);
        assertEquals("Theater\nName : Taj\nMovies : [London has fallen]\nReviews : [Review\nAuthor : Mohammad\nbody : Great\nStars : 2\nMovie : Amazing spider Man, Review\nAuthor : ASAC\nbody : Amazing Theater\nStars : 5\n]", theater.toString());
    }
    @Test
    void theater_AddMovie_ReturnMovie(){
        Theater theater = new Theater("Taj");
        theater.addMovie("Extraction");
        assertEquals("Extraction",theater.getMovies().toString().replace("[","").replace("]",""));
    }
    @Test
    void theater_AddMultipleMovies_ReturnListOfMovies(){
        Theater theater = new Theater("Taj");
        theater.addMovie("Extraction");
        theater.addMovie("Amazing Spider Man");
        theater.addMovie("Olympus has fallen");
        theater.addMovie("Rush hour");
        List<String> expectedMovies = new ArrayList<>();
        expectedMovies.add("Extraction");
        expectedMovies.add("Amazing Spider Man");
        expectedMovies.add("Olympus has fallen");
        expectedMovies.add("Rush hour");
        for (int i = 0; i < theater.getMovies().size(); i++) {
            assertEquals(expectedMovies.get(i),theater.getMovies().get(i));
        }
    }

    @Test
    void theater_RemoveMovie_ReturnTrue(){
        Theater theater = new Theater("Taj");
        theater.addMovie("Extraction");
        assertTrue(theater.removeMovie("Extraction"));
    }

    @Test
    void theater_RemoveNonExistenceMovie_ReturnFalse(){
        Theater theater = new Theater("Taj");
        theater.addMovie("Extraction");
        assertFalse(theater.removeMovie("Thor"));
    }
    @Test
    void theater_RemoveFromMultipleMovies_ReturnListOfMovies(){
        Theater theater = new Theater("Taj");
        theater.addMovie("Extraction");
        theater.addMovie("Amazing Spider Man");
        theater.addMovie("Olympus has fallen");
        theater.removeMovie("Amazing Spider Man");
        List<String> expectedMovies = new ArrayList<>();
        expectedMovies.add("Extraction");
        expectedMovies.add("Olympus has fallen");
        for (int i = 0; i < theater.getMovies().size(); i++) {
            assertEquals(expectedMovies.get(i),theater.getMovies().get(i));
        }
    }
    @Test
    void theater_RemoveFromEmptyList_ReturnFalse(){
        Theater theater = new Theater("Taj");
        assertFalse(theater.removeMovie("Interstellar"));
    }
}
