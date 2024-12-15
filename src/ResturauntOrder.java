import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * @author class that'll validate user's number, save # of meals and loop
 * user input and return food based on # of meals inputted
 */
public class ResturauntOrder {
    private int numMeals;
    private int mealOrder;
    private String mealName;
    private boolean acceptMeal;

    //setting a value to numMeals variable and setting acceptMeal to false
    public ResturauntOrder(int numMeals)
    {
        this.numMeals = numMeals;
        this.acceptMeal = false;
    }

    Scanner input = new Scanner(System.in);


    //Confirming if number of meals is valid
    public void validateNumMeals(int numMeals)
    {
        while (!acceptMeal)
        {
            if (numMeals <= 0)
            {
                System.out.println("Don't you think you should eat?");
                System.out.println("How many meals would you like to eat for today?");
                numMeals = input.nextInt();
            }
            else if (numMeals > 3)
            {
                System.out.println("A bit much don't you think?");
                System.out.println("How many meals would you like to eat for today?");
                numMeals = input.nextInt();
            }
            else if (numMeals >= 1 && numMeals <= 3)
            {
                System.out.println("Great!");
                acceptMeal = true;
            }
        }
        askForMeal();
    }

    //method will ask user to pick between 1-12
    public void askForMeal( )
    {
        //StringBuilder mealChoices = new StringBuilder();
        //looping for however many number of meals the user inputs
        for (int i = 0; i <= numMeals; i++)
        {
            System.out.println("Enter a number between 1-12 to get food");
            mealOrder = input.nextInt();

            if (mealOrder == 1)
            {
                System.out.println("A tiny bowl of cereal and room temperature milk");
                System.out.println("Press any number to continue");
            }
            else if (mealOrder == 2)
            {
                //String mealOrder2 = "A nice juicy 'Premium' Wagyu Beef steak with a side of refined water ;)";
                System.out.println ("A nice juicy 'Premium' Wagyu Beef steak with a side of refined water ;)");
                System.out.println("Press any number to continue");
            }
            else if (mealOrder == 3)
            {
                System.out.println("Press any number to continue");
                System.out.println("Press any number to continue");
            }
            else if (mealOrder == 4)
            {
                System.out.println("Press any number to continue");
            }
            else if (mealOrder == 5)
            {
                System.out.println("Press any number to continue");
            }
            else if (mealOrder == 6)
            {
                System.out.println("Press any number to continue");
            }
            else if (mealOrder == 7)
            {
                System.out.println("Press any number to continue");
            }
            else if (mealOrder == 8)
            {
                System.out.println("Press any number to continue");
            }
            else if (mealOrder == 9)
            {
                System.out.println("Press any number to continue");
            }
            else if (mealOrder == 10)
            {
                System.out.println("Press any number to continue");
            }
            else if (mealOrder == 11)
            {
                System.out.println("Press any number to continue");
            }
            else if (mealOrder == 12)
            {
                System.out.println("Press any number to continue");
            }
            else {
                System.out.println ("invalid number!");
            }
        }
        return mealChoices.toString();
    }




}
