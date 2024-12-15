import java.util.Scanner;

/**
 * @author class that'll validate user's number, save # of meals and loop
 * user input and return food based on # of meals inputted
 */
public class ResturauntOrder {
    private int numMeals;
    private int mealOrder;
    private String mealName;
    private boolean acceptMeal;

    //setting a value to numMeals variable
    public ResturauntOrder(int numMeals)
    {
        this.numMeals = numMeals;
    }

    Scanner input = new Scanner(System.in);


    //Confirming if number of meals is valid
    public void validateNumMeals()
    {
        while (!acceptMeal)
        {
            if (numMeals == 0)
            {
                System.out.println("Don't you think you should eat?");
                acceptMeal = false;
                System.out.println("How many meals would you like to eat for today?");
                numMeals = input.nextInt();
            }
            else if (numMeals > 0 && numMeals <= 3)
            {
                acceptMeal = true;
            }
            else if (numMeals > 3 && numMeals <= 10)
            {
                System.out.println("A bit much don't you think?");
                acceptMeal = false;
                System.out.println("How many meals would you like to eat for today?");
                numMeals = input.nextInt();
            }
            else if (numMeals > 10)
            {
                System.out.println("Woah buddy");
                acceptMeal = false;
                System.out.println("How many meals would you like to eat for today?");
                numMeals = input.nextInt();
            }
        }
    }





}
