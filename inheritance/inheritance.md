# OverView

This library contain four class

- Restaurant Class : which is a class that accepts the `name , price , stars(rate) and reviews`

- Reviews Class : Class that accepts `author , star , body , and restauarnt`
- Shop class : A class that accepts `name , description , numOfDollars`
- Theater Class : A class that accepts `name` 
## Restaurant Class

The `Restaurant` class represents a restaurant entity with attributes like name, price range, and overall rating. It implements the `AddReview` interface, allowing it to receive and manage customer reviews. Each restaurant maintains a list of reviews that contribute to its overall rating. The class includes methods for retrieving the restaurant's name, price range, average rating, and list of reviews. Additionally, it contains functionality to add new reviews and update the average rating based on the received reviews.


### Methods

| Method                                 | Description                                                                                      |
| -------------------------------------- | ------------------------------------------------------------------------------------------------ |
| `Restaurant(String name, int rate, int price)` | Constructor that initializes the restaurant with a given name, rating, and price range.    |
| `double getRate()`                      | Retrieves the current average rating of the restaurant.                                         |
| `String getName()`                      | Retrieves the name of the restaurant.                                                           |
| `int getPrice()`                        | Retrieves the price range of the restaurant.                                                    |
| `List<Review> getReviews()`             | Retrieves a list of reviews associated with the restaurant.                                    |
| `void addReview(Review review)`         | Adds a new review to the restaurant's list of reviews and updates the average rating.          |
| `private void updateAverageStars()`     | Calculates and updates the average rating based on the current list of reviews.                |
| `String toString()`                     | Generates a string representation of the restaurant, including its name, price, rate, and reviews. |

## Review Class

The `Review` class represents a customer review for various entities such as restaurants, shops, and theaters. It includes constructors for different entity types, allowing the creation of reviews with associated ratings, authors, and review text. Each review contains information about the author, body text, star rating, and, in the case of theaters, the associated movie. The class provides methods to retrieve the review's body, author, star rating, and associated restaurant (if applicable). The `toString` method generates a string representation of the review, including its author, body, stars, and movie (if applicable).

### Methods

| Method                                                                         | Description                                                                                                    |
|--------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------|
| `Review(int stars, String author, String body, Restaurant res)`                | Constructor for creating a review associated with a restaurant.                                                |
| `Review(int stars, String author, String body, Shop shop)`                     | Constructor for creating a review associated with a shop.                                                      |
| `Review(int stars, String author, String body, Theater theater, String movie)` | Constructor for creating a review associated with a theater and a movie.                                       |
| `Review(int stars, String author, String body, Theater theater)`               | Constructor for creating a review associated with a theater.                                                   |
| `String getBody()`                                                             | Retrieves the body text of the review.                                                                         |
| `String getAuthor()`                                                           | Retrieves the author of the review.                                                                            |
| `int getStars()`                                                               | Retrieves the star rating of the review.                                                                       |
| `Restaurant getRestaurant()`                                                   | Retrieves the associated restaurant for restaurant-related reviews.                                            |
| `String toString()`                                                            | Generates a string representation of the review, including its author, body, stars, and movie (if applicable). |

## Shop Class

The `Shop` class represents a shop entity with attributes such as name, description, and price range. It implements the `AddReview` interface, allowing it to receive and manage customer reviews. Each shop maintains a list of reviews associated with it. The class includes methods for retrieving the shop's name, description, price range, and list of reviews. Additionally, it provides functionality to add new reviews.

### Methods

| Method                                                 | Description                                                                                           |
|--------------------------------------------------------|-------------------------------------------------------------------------------------------------------|
| `Shop(String name, String description, int numDollar)` | Constructor that initializes the shop with a given name, description, and price range.                |
| `String getName()`                                     | Retrieves the name of the shop.                                                                       |
| `String getDescription()`                              | Retrieves the description of the shop.                                                                |
| `int getNumDollar()`                                   | Retrieves the price range of the shop.                                                                |
| `List<Review> getReviews()`                            | Retrieves a list of reviews associated with the shop.                                                 |
| `void addReview(Review review)`                        | Adds a new review to the shop's list of reviews.                                                      |
| `String toString()`                                    | Generates a string representation of the shop, including its name, description, dollars, and reviews. |

## Theater Class

The `Theater` class represents a theater entity with attributes such as name and a list of movies. It implements the `AddReview` interface, allowing it to receive and manage customer reviews. Each theater maintains a list of movies being shown and reviews associated with it. The class includes methods for retrieving the theater's name, list of movies, and list of reviews. It also provides functionality to add and remove movies from the theater's movie list, and to add new reviews.

### Methods

| Method                              | Description                                                                                 |
|-------------------------------------|---------------------------------------------------------------------------------------------|
| `Theater(String name)`              | Constructor that initializes the theater with a given name.                                 |
| `String getName()`                  | Retrieves the name of the theater.                                                          |
| `List<String> getMovies()`          | Retrieves a list of movies being shown at the theater.                                      |
| `List<Review> getReviews()`         | Retrieves a list of reviews associated with the theater.                                    |
| `void addMovie(String movie)`       | Adds a new movie to the list of movies shown at the theater.                                |
| `boolean removeMovie(String movie)` | Removes a movie from the list of movies shown at the theater. Returns `true` if successful. |
| `void addReview(Review review)`     | Adds a new review to the theater's list of reviews.                                         |
| `String toString()`                 | Generates a string representation of the theater, including its name, movies, and reviews.  |


Link -> [RestauarntClass Code](./lib/src/main/java/inheritance/Restaurant.java)

Link-> [ReviewClass Code](./lib/src/main/java/inheritance/Review.java)

Link-> [ShopClass Code](./lib/src/main/java/inheritance/Shop.java)

Link-> [TheaterClass Code](./lib/src/main/java/inheritance/Theater.java)


## Run test

You can run the tests using `gradlew test`
