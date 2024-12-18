/**
 * main class that'll ask for # of meals they want for the day
 * then asks to pick a # between 1-12
 * Takes user input and print out user's food
 * repeats based on the number of meals they input
 */
import java.util.Scanner;
public class foodGeneratorMain {
    public static void main(String[] args) {


        //creating scanner object
        Scanner input = new Scanner(System.in);

        //welcome sign for user
        System.out.println("Welcome to the " + "\u001B[35m" + "Precious " + "\u001B[33m" + "Lily " + "\u001B[32m" + "Food Generator");
        //asking for user input on number of meals they want
        System.out.println("How many meals would you like to have today?");
        int userMeals = input.nextInt();
        ResturauntOrder userTotalMeal = new ResturauntOrder(userMeals);
        userTotalMeal.validateNumMeals(userMeals);

        //asking user to pick a number between 1-12
        //System.out.println("Ok! Please pick a number between 1-12");
        int userNum = input.nextInt();
        ResturauntOrder userNumMeal = new ResturauntOrder (userNum);
        userNumMeal.askForMeal();

    }
}