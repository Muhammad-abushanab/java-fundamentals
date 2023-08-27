package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTest {
    @Test
    void constructorParameterCheck_ReturnTrueOnEachProperty(){
        Shop shop = new Shop("Zara" , "Clothes Market" , 50);
        assertEquals("Zara",shop.getName());
        assertEquals("Clothes Market",shop.getDescription());
        assertEquals(50 ,shop.getNumDollar());
    }
    @Test
    void Shop_AddReview_ReturnToStringWithReview() {
        Shop shop = new Shop("Zara", "Clothes Market", 50);
//        Review rev = new Review(5, "Mohammad", "Amazing quality", shop);
        Review rev = new Review.ReviewBuilder("Amazing quality","Mohammad",5).setShop(shop).build();
        String expected = "Shop\nName : Zara\nDescription : Clothes Market\nDollars : 50\nReview : [Review\nAuthor : Mohammad\nbody : Amazing quality\nStars : 5\n]";
        assertEquals(expected, shop.toString());
    }
    @Test
    void shop_ToString_ReturnToStringInRightOrder(){
        Shop shop = new Shop("Zara", "Clothes Market", 50);
        assertEquals("Shop\nName : Zara\nDescription : Clothes Market\nDollars : 50\nReview : []",shop.toString());
    }
}
