/**
 * Brennon Treadwell, Ian Pena, Alex Walsh
 * This is the driver file for our Transportation classes
 * This implements the solution posed in the Lab6 description
 */
import java.util.Scanner;

public class WTCTreadwellPenaWalsh {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Transportation selectedOption = null;

        //create air transportation objects
        Plane plane = new Plane(249.99f, "Plane", 100, 555.55f, false, 0, "Plane leaves in one hour, better hurry!",
                2000, 50.44f, 50.44f, 200, 4, "Boeing 737");
        HotAirBalloon balloon = new HotAirBalloon(19.99f, "Air Balloon", 4, 10.1f, true, 2, "Go over there to pick your balloon.",
                888.88f, 10, 10000, true, 2000);
        Dirigible dirigible = new Dirigible(24999.99f, "Dirigible", 500, 200, true, 7, "Idk I've never rented a dirigible. Phone a friend?",
        2000, 100, 25, 100000, "Helium?");
        Helicopter helicopter = new Helicopter(250, "Helicopter", 6, 149.8f, false, 0, "BYOP - Bring Your Own Parachute",
                5000.8f, 100, 80, 4, "XCopter2000 Xtreme Edition");

        //POLYMORPHISM
        //This array of super class references holds subclass objects
        AirTransportation[] airTrans = {plane, balloon, dirigible, helicopter};

        /*
        this is where land transportation will go
         */
        //POLYMORPHISM
        //This array of super class references holds subclass objects
        //LandTransportation[] landTrans = {};

        /*
        this is where water transportation will go
         */
        //POLYMORPHISM
        //This array of super class references holds subclass objects
        //WaterTransportation[] waterTrans = {};

        //continue prompting user until they find and confirm a transportation type
        boolean confirmed;
        do{
            String transCategory = GetTransCategory();

            if (transCategory.equals("air")){
                DisplayTransInfo(airTrans);
                selectedOption = GetTransOption(airTrans);
                System.out.println(selectedOption);
            }
            else if (transCategory.equals("land")) {
                //availableTransMethods = DisplayTransInfo(landTrans);
                //selectedOption = GetTransOption(landTrans);
                //System.out.println(selectedOption);
            }
            else{
                //availableTransMethods = DisplayTransInfo(waterTrans);
                //selectedOption = GetTransOption(waterTrans);
                //System.out.println(selectedOption);
            }

            confirmed = VerifyDecision(selectedOption);

        }while(!confirmed);

        int passengers = GetPassengerCount(selectedOption);
        System.out.println("Your total cost is: $" + (selectedOption.getPrice() * passengers));
        System.out.println("Below are your travel instructions.");
        System.out.println(selectedOption.getTravelInstructions());

        input.close();

    }

    public static String GetTransCategory(){
        /**
         * prompts the user to choose between land, air, and water.
         * Handles validation checking and continues prompting until valid type received
         * returns transportation type selected as String
         */
        Scanner input = new Scanner(System.in);

        //let user choose which type of transportation type to use
        System.out.print("Would you like to use land, air, or water transportation? ");
        String transportationType = input.nextLine();

        //validate input
        boolean validType = (transportationType.equals("water") || transportationType.equals("land") ||
                transportationType.equals("air"));

        //if invalid input, continue prompting user until valid input received
        while (!validType){
            System.out.print("Invalid type entered, please enter land, air, or water. ");
            transportationType = input.nextLine();
            validType = (transportationType.equals("water") || transportationType.equals("land") ||
                    transportationType.equals("air"));
        }

        //will return 'air', 'water', or 'land'
        return transportationType;

    }

    public static String[] DisplayTransInfo(Transportation[] transOptions){
        /**
         * displays information relating to the transportation the user selected
         * then returns a list of selectable trans methods
         */

        String[] availableTransMethods = new String[transOptions.length];
        int idx = 0;


        System.out.printf("%-15s%-15s%-15s%-15s%-15s%n", "Name", "Cost", "Rental", "Avg. Speed", "Passenger Count");
        //POLYMORPHISM
        for(Transportation option : transOptions){
            System.out.printf("%-15s%-15.2f%-15b%-15.2f%-15d%n", option.getName(), option.getPrice(), option.getIsRental(),
                    option.getAvgSpeed(), option.getNumPassengers());
            availableTransMethods[idx] = option.getName();
            idx += 1;
        }

        return availableTransMethods;
    }

    public static Transportation GetTransOption(Transportation[] transOptions) {
        /**
         * Handles user input for choosing which transportation option they would like.
         */
        Scanner input = new Scanner(System.in);

        boolean validOption;
        Transportation option = null;
        String optionName;
        do{
            System.out.print("Please choose an option from those displayed above. ");
            optionName = input.nextLine();

            validOption = false;
            //POLYMORPHISM
            for(Transportation availableOption : transOptions){
                if (optionName.equals(availableOption.getName())){
                    validOption = true;
                    option = availableOption;
                }
            }
        }while(!validOption);

        return option;
    }

    public static boolean VerifyDecision(Transportation transOption){
        Scanner input = new Scanner(System.in);
        System.out.print("Please confirm that you would like to use the " + transOption.getName() + " option. (yes/no) ");
        String decision = input.nextLine();

        boolean validDecision = decision.equals("yes") || decision.equals("no");
        while(!validDecision){
            System.out.print("Invalid input, please enter 'yes' or 'no'. ");
            decision = input.nextLine();
            validDecision = decision.equals("yes") || decision.equals("no");
        }

        return decision.equals("yes");
    }

    public static int GetPassengerCount(Transportation transOption){
        Scanner input = new Scanner(System.in);

        System.out.print("How many passengers will you be purchasing travel for? ");
        int passengerCount = input.nextInt();
        while (passengerCount <= 0 || passengerCount > transOption.getNumPassengers()){
            System.out.print("Invalid input. Please enter a number greater than 0 and not larger than the allowed amount of passengers. ");
            passengerCount = input.nextInt();
        }
        return passengerCount;
    }

}
