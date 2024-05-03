import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<FoodItem> foodItems = new ArrayList<>();
        while (true){
            System.out.println(

                    """
\n  Options
==============
1: Print items.
2: Add item.
3: Remove item.
4: Exit the program.
===============
    Choice:                                        
                     """
            );
            int userInput = keyboard.nextInt();
                System.out.println();
            if (userInput == 1){
                Main.printItems(foodItems);
            }
            else if (userInput == 2){
                Main.addItem(keyboard, foodItems);
            }
            else if (userInput == 3){
                Main.removeItem(keyboard, foodItems);
            }
            else if (userInput == 4){
                break;
            }
        }
        //TODO: methods for printing, adding, and removing are provided in an empty state below.
    }

    public static void printItems(ArrayList<FoodItem> foodItems) {
        System.out.printf(foodItems.toString());
        if (foodItems.isEmpty()){
            System.out.println("No items in order!");
        }

    }

    public static void addItem(Scanner keyboard, ArrayList<FoodItem> foodItems) {
        System.out.println("What is the name of your food?");
        String name = keyboard.next();
        System.out.println("What is the Price of your food?");
        double Price = keyboard.nextDouble();
        System.out.println("Does your food item have gluten?\n true/false");
        boolean TrueFalse = keyboard.nextBoolean();
        FoodItem Food = new FoodItem(name, Price, TrueFalse);
        foodItems.add(Food);
        //TODO: ask for the needed information to create a FoodItem (name, price, and true/false for gluten).
        //TODO: For the gluten value, ask them to enter "true" or "false" and use keyboard.nextBoolean() to retrieve it.
        //TODO: you may need to flush the stream, don't forget to test the program to check for that.
        //TODO: after getting the information, create a new FoodItem and add it to foodItems.
    }

    public static void removeItem(Scanner keyboard, ArrayList<FoodItem> foodItems) {
        System.out.println("What food would you like to remove?");
        String remove = keyboard.next();
        foodItems.removeIf(Food -> remove.equalsIgnoreCase(Food.name));
        //TODO: ask for the name of a food item to remove, then loop over the list to find it.
    } // for (type var : array )
}