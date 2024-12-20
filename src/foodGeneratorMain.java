/**
 * main class that'll ask for # of meals they want for the day
 * then asks to pick a # between 1-12
 * Takes user input and print out user's food
 * repeats based on the number of meals they input
 * @author Lily and Precious
 * @version 2.0.0
 */
import java.util.Scanner;
public class foodGeneratorMain {
    public static void main(String[] args) {

        //creating scanner object
        Scanner input = new Scanner(System.in);

        //welcome sign for user
        System.out.println("Welcome to the " + "\u001B[35m" + "Precious " + "\u001B[33m" + "Lily " + "\u001B[32m" + "Food Generator" + "\u001B[0m");

        //asking for user input on number of meals they want
        System.out.println("How many meals would you like to have today?");
        int userMeals = input.nextInt();

        //checking to make sure meals are between 1-12 since there are 12 options
        while (userMeals < 1 || userMeals > 12)
        {
            System.out.println ("Invalid number of meals. Please enter a number between 1 and 12.");
            userMeals = input.nextInt();
        }
        ResturauntOrder userTotalMeal = new ResturauntOrder(userMeals);
        userTotalMeal.askForMeal();


        input.nextLine();
        String userSatis = "";

        //while loop--confirming if user is satisfied with their meals
        while (true)
        {

            System.out.println("Were you satisfied with your meal?");
            userSatis = input.nextLine();

            if (userSatis.indexOf("no") >= 0 || userSatis.indexOf("NO") >= 0)
            {
                ResturauntOrder userSatisfaction = new ResturauntOrder(userSatis);
                String response1 = userSatisfaction.serverSatisfaction(userSatis);
                System.out.println(response1);
            }
            else if (userSatis.indexOf("yes") >= 0 || userSatis.indexOf("YES") >= 0 )
            {
                System.out.println ("Yay :3");
                break;
            }
            else
            {
                ResturauntOrder userSatisfaction = new ResturauntOrder(userSatis);
                String response1 = userSatisfaction.serverSatisfaction(userSatis);
                System.out.println(response1);
            }
        }

        input.close();
    }
}