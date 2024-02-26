package lab1.src;
import lab1.src.Movie;

import java.util.Scanner;

public class MovieDriver {
    public static void main(String[] args) {
        // Create a new object of type Scanner that reads from the keyboard
        Scanner keyboard = new Scanner(System.in);

        // Create a new movie object
        Movie movie = new Movie();
        
         char  continueResponse;
         String input;
do {
	
	
        // Prompt the user to enter the title of a movie
        System.out.print("Enter the title of the movie: ");
        // Read in the line that the user types
        String title = keyboard.nextLine();
        // Set the title in the movie object
        movie.setTitle(title);

        // Prompt the user to enter the movie’s rating
        System.out.print("Enter the movie's rating: ");
        // Read in the line that the user types
        String rating = keyboard.nextLine();
        // Set the rating in the movie object
        movie.setRating(rating);

        // Prompt the user to enter the number of tickets sold at a (unnamed) theater
        System.out.print("Enter the number of tickets sold: ");
        // Read in the integer that the user types
        int soldTickets = keyboard.nextInt();
        // Set the number of tickets sold in the movie object
        movie.setSoldTickets(soldTickets);

        // Print out the information using the movie’s toString method
        System.out.println(movie.toString());
        System.out.println("Would you like to enter another movie? (y/n)");
         input = keyboard.nextLine();
         continueResponse = input.charAt(0);
    
}
while (continueResponse == 'Y' || continueResponse == 'y');
        // Close the scanner
        keyboard.close();
    }
}

