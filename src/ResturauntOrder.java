import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * @author class that'll validate user's number, save # of meals and loop
 * user input and return food based on # of meals inputted
 */
public class ResturauntOrder {
    private int numMeals;
    public int mealOrder;
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
                break;
            }
        }
        askForMeal();
    }

    //method will ask user to pick between 1-12
    public String askForMeal()
    {
        //StringBuilder mealChoices = new StringBuilder();
        //looping for however many number of meals the user inputs
        for (int i = 0; i < numMeals; i++)
        {
            System.out.println("Enter a number between 1-12 to get food");
            mealOrder = input.nextInt();

            if (mealOrder == 1)
            {
                System.out.println("A tiny bowl of cereal and room temperature milk");
            }
            else if (mealOrder == 2)
            {
                //String mealOrder2 = "A nice juicy 'Premium' Wagyu Beef steak with a side of refined water ;)";
                //return mealOrder2;
                System.out.println ("A nice juicy 'Premium' Wagyu Beef steak with a side of refined water ;)");

            }
            else if (mealOrder == 3)
            {
                System.out.println("a");
            }
            else if (mealOrder == 4)
            {
                System.out.println("b");
            }
            else if (mealOrder == 5)
            {
                System.out.println("c");
            }
            else if (mealOrder == 6)
            {
                System.out.println("d");
            }
            else if (mealOrder == 7)
            {
                System.out.println("e");
            }
            else if (mealOrder == 8)
            {
                System.out.println("f");
            }
            else if (mealOrder == 9)
            {
                System.out.println("g");
            }
            else if (mealOrder == 10)
            {
                System.out.println("h");
            }
            else if (mealOrder == 11)
            {
                System.out.println("i");
            }
            else if (mealOrder == 12)
            {
                System.out.println("j");
            }
            else {
                System.out.println ("invalid number!");
            }
        }
        return "Thanks!";
    }


//public String serverSatisfaction(String satisfaction)
//{
    //String response = "";
    //if (satisfaction.indexOf("no") >= 0)
    //{
      //  response = serverResponses();
    //}
  //  else if (satisfaction.indexOf("NO") >= 0
//|| satisfaction.indexOf("nah") >= 0 || satisfaction.indexOf("naur") >= 0)
//{
  //  response = serverResponses();
//}
  //  else
//{
  //  response = "yay";
//}
//}

//public String serverResponses()
//{
  //  int NUMBER_OF_RESPONSES = 4;
   // double responseIndex = Math.random();
   // int typeOfResponse = (int) (responseIndex * NUMBER_OF_RESPONSES);
   // String response = "";

    //if (typeOfResponse == 0)
    //{
    //    response = "no is not the correct answer >:[";
    //}
    //else if (typeOfResponse == 1)
    //{
    //    response = "I won't take no for an answer!";
   // }
    //else if (typeOfResponse == 2)
    //{
   //     response = "You better say yes.";
  //  }
   // else if (typeOfResponse == 3)
   // {
    //    response = "Please say yes I NEEEEEED it :(";
  //  }
  //  return response;

//}

}
