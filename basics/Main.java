import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int choice = 0;
        // clock();
        while (true) {
            System.out
                    .print("------------------------\nWelcome to Class 01 Task\nPlease pick your choice:\n1- Pluralize\n2- Flip Coin\n3- Clock\n4- Exit\n");

            if (myObj.hasNextInt()) {
                choice = myObj.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Please insert your word:");
                        myObj.nextLine();
                        String word = myObj.nextLine();
                        System.out.println("Please insert your number:");
                        short number = myObj.nextShort();
                        pluralize(word, number);
                        break;
                    case 2:
                        System.out.println("Please insert the number of flips:");
                        short flips = myObj.nextShort();
                        flipNHeads(flips);
                        break;
                    case 3:
                        clock();
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } else {
                System.out.println("Invalid input. Please enter a number for your choice.");
                myObj.nextLine();
            }
        }
    }

    public static void pluralize(String word, int number) {
        word = number > 1 || number == 0 ? word + "s" : word;
        System.out.println("I own " + number + " " + word);
    }

    public static void flipNHeads(int n) {
        Random rand = new Random();
        byte rowCount = 0;
        byte flips = 0;
        while (rowCount != n) {
            float random = rand.nextFloat();
            flips++;
            if (random > 0.5) {
                rowCount++;
                System.out.println("heads");
            } else {
                rowCount = 0;
                System.out.println("tails");
            }
        }
        System.out.println("It took " + flips + " flips to flip " + rowCount + " heads in a row");
    }

    public static void clock() {
        LocalDateTime prevTime = LocalDateTime.MIN;
        while (true) {
            LocalDateTime currentTime = LocalDateTime.now();
            if (currentTime.getSecond() != prevTime.getSecond()) {
                System.out.println(currentTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
                prevTime = currentTime;
            }
        }
    }
}