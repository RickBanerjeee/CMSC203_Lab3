package lab1;

import java.util.Scanner;

public class MovieDriver {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String continueProgram = "y";

        while (continueProgram.equalsIgnoreCase("y")) {

            Movie movie = new Movie();

            System.out.print("Enter the title of a movie: ");
            String title = keyboard.nextLine();
            movie.setTitle(title);

            System.out.print("Enter the movie's rating: ");
            String rating = keyboard.nextLine();
            movie.setRating(rating);

            System.out.print("Enter the number of tickets sold at a theater: ");
            int soldTickets = keyboard.nextInt();
            movie.setSoldTickets(soldTickets);

            System.out.println(movie.toString());

            keyboard.nextLine();

            System.out.print("Do you want to enter another movie? (y/n): ");
            continueProgram = keyboard.nextLine();
        }

        keyboard.close();
    }
}