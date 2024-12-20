import java.util.Scanner;
import java.util.Random;

/**
 * class that'll validate user's number, save # of meals and loop
 * user input and return food based on # of meals inputted
 * @author Lily and Precious
 * @version 2.0.0
 */
public class ResturauntOrder {
    private int numMeals;
    private String mealName;
    private String satisfaction;

    /**
     * constructor
     * @param numMeals number of meals represented in integers
     */
    public ResturauntOrder(int numMeals)
    {
        this.numMeals = numMeals;
    }

    /**
     * constructor
     * @param satisfaction user satisfaction represented in string
     */
    public ResturauntOrder(String satisfaction)
    {
        this.satisfaction = satisfaction;
    }


    /**
     * generates random meal (within 1-12) by calling on getMeal method
     * @return random meals for user
     */
    public void askForMeal()
    {
        Random rand = new Random();

        for (int i = 0; i < numMeals; i++)
        {
            int mealOrder = rand.nextInt(12) + 1;
            String meal = getMeal(mealOrder);
            System.out.println("Meal: " + (i + 1) + " " + meal);
        }
    }

    /**
     * sorts list of meals using switch statement
     * @param mealOrder randomly picks amount of meals based on users number
     * @return list of meals based on mealOrder input
     */
    private String getMeal (int mealOrder)
    {
        //switch statement to return a random meal otherwise invalid
        switch (mealOrder)
        {
            case 1: return "A hot plate of Lumpia";
            case 2: return "A sizzling plate of Sising";
            case 3: return "A warm bowl of fried noodles";
            case 4: return "A chilly bowl of dirty ice cream!";
            case 5: return "A cup of crunchy Lechon Kawali";
            case 6: return "A savory dish of Halo Halo!!";
            case 7: return "A steaming plate of com tam ̋(ˊ•͈ ꇴ •͈ˋ)و";
            case 8: return "A rich bowl of Bun Bo Hue! ✧٩(ˊωˋ*)و✧";
            case 9: return "A delectable bowl of warm Chao ✧٩(ˊωˋ*)و✧";
            case 10: return "A crispy banh mi sandwich ( ´ ▽ ` )";
            case 11: return "A refreshing bowl of cold Bun Ga Nuong! (و ˃̵ᴗ˂̵)و";
            case 12: return "A delicate dish of Banh Da Lon !(•̀ᴗ•́)";
            default: return "Invalid meal selection.";
        }
    }

    /**
     * grabs random response based on users input using serverResponses method
     * @param satisfaction the satisfactory rate of the user's meal
     * @return a servers response
     */
    public String serverSatisfaction(String satisfaction)
    {
        String response = "";
        if (satisfaction.indexOf("no") >= 0  || satisfaction.indexOf("nah") >= 0 || satisfaction.indexOf("naur") >= 0 || (satisfaction.indexOf("NO") >= 0))
        {
            response = serverResponses();
        }
        else
        {
            response = "yay";
        }
        return response;
    }


    /**
     * generates random response based on a predetermined list of responses
     * @return the server's response based on users input
     */
    public String serverResponses()
    {
        int NUMBER_OF_RESPONSES = 4;
        double responseIndex = Math.random();
        int typeOfResponse = (int) (responseIndex * NUMBER_OF_RESPONSES);
        String response = "";

        switch (typeOfResponse)
        {
            case 0:

                response = "\u001B[31m" + "no is not the correct answer >:[";
                break;

            case 1:
                response = "\u001B[31m" + "I won't take no for an answer!";
                break;

            case 2:
                response = "\u001B[31m" + "You better say yes.";
                break;

            case 3:
                response = "\u001B[36m" + "Please say yes I NEEEEEED it :(";
                break;

            default:
                response = "grrrrrrr";
                break;

        }
        return response;
    }

}
