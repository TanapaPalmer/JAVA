public class CafeJava {
    public static void main(String[] args) {

        String barista = "Barista";

        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        // Create 3 more drink price variables, for drip coffee, latte and cappucino following the same camel case naming convention.
        double mochaPrice = 3.5;
        double dripCoffeePrice = 3.0;
        double lattePrice = 3.6;
        double cappucinoPrice = 3.7;

        // Coffee types
        String drink1 = "Mocha";
        String drink2 = "Drip Coffee";
        String drink3 = "Latte";    
        String drink4 = "Cappucino";
    
        // Customer name variables (add yours below)
        // Create 3 more customer variables for Sam, Jimmy and Noah, following the same variable naming convention in the example.
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";    
        String customer4 = "Noah";

        // Order completions (add yours below)
        // Create the order status flag (true/false) for each customer, following the variable naming convention in the example.
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(barista + ": " + generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //

        // For the next tasks, we will be simulating customer interactions, printing messages to the screen, based on scenarios.
        // Cindhuri ordered a coffee. Print to the console the correct status message, based on her order status.
        System.out.println(barista + ": " + "You ordered a " + drink2);
        if (isReadyOrder1) {
            System.out.println(barista + ": " + customer1 + readyMessage);
            System.out.println(barista + ": " + displayTotalMessage + cappucinoPrice);
        }
        else {
            System.out.println(barista + ": " + customer1 + pendingMessage);
        }
        System.out.println("--------------------------");

        // Noah ordered a cappucino. Use an if statement to check the status of his order and print the correct status message.
        // If it is ready, also print the message to display the total.
        // Note: Outcomes may be different depending on what you assigned as the status.
        System.out.println(barista + ": " + generalGreeting + customer4);
        System.out.println(barista + ": " + "You ordered a " + drink4);
        if (isReadyOrder4) {
            System.out.println(barista + ": " + customer4 + readyMessage);
            System.out.println(barista + ": " + displayTotalMessage + cappucinoPrice);
        }
        else {
            System.out.println(barista + ": " + customer4 + pendingMessage);
        }
        System.out.println("--------------------------");


        // Sam just ordered 2 lattes, print the message to display their total.
        // Next, use an if statement to print the appropriate order status message.
        // Change the isReady flag value from true to false or vice versa in order to test your control logic (if-statement).
        System.out.println(barista + ": " + generalGreeting + customer2);
        System.out.println(barista + ": " + "You ordered 2 " + drink3 + "s");
        if (isReadyOrder2) {
            System.out.println(barista + ": " + customer2 + readyMessage);
        }
        else {
            System.out.println(barista + ": " + customer2 + pendingMessage);
        }
        System.out.println(barista + ": " + displayTotalMessage + lattePrice * 2);
        System.out.println("--------------------------");

        // Jimmy just realized he was charged for a coffee but had ordered a latte.
        // Print the total message with the new calculated total (what he owes) to make up the difference.
        System.out.println(barista + ": " + generalGreeting + customer3);
        System.out.println(barista + ": " + "You ordered a " + drink3);
        System.out.println(barista + ": " + customer2 + readyMessage);
        System.out.println(barista + ": " + displayTotalMessage + dripCoffeePrice);
        System.out.println(customer3 + ": I thought a Latte was $3.60");
        System.out.println(barista + ": My apologies. I have charged you as a " + drink2 + " instead of a " + drink3);
        System.out.println(barista + ": " + displayTotalMessage + dripCoffeePrice);
        System.out.println(barista + ": You owe us $ " + (lattePrice - dripCoffeePrice));
        System.out.println("--------------------------");

    // Try changing the price values for each drink and isReady flags (booleans), to test if all of your logic works,
    // even when prices and statuses are changed.
        System.out.println(customer4 + ": I ordered a " + drink4 + " but is it possible to change to 2 " + drink1 + "s instead?");
        System.out.println(barista + ": Of course! " + displayTotalMessage + mochaPrice * 2 + " You owe us $" + ((mochaPrice * 2) - cappucinoPrice));
    }
}








