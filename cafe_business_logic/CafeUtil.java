import java.util.ArrayList;

public class CafeUtil {

    // int getStreakGoal()
    // Cafe Java wants to implement a reward system for customers who always buy more drinks than they did the week before.
    // To calculate how many drinks they need after 10 weeks, write a method that sums together every consecutive integer from 1 to 10
    // and returns the sum. In other words, add 1 + 2 + 3.. and so on up to 10 and return the result.
    // The number printed should be 55.
    
    public int getStreakGoal() {
        int sum = 0;
        for(int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    // Ninja Bonus: Add a parameter, numWeeks so that an admin can change the number from 10 to whatever they want.

    public int getStreakGoalBonus() {
        int sum = 0;
        for(int numWeeks = 1; numWeeks <= 10; numWeeks++) {
            sum += numWeeks;
        }
        return sum;
    }

// -----------------------------------------------------------------------------------

    // double getOrderTotal(double[] prices)
    // Given an array of item prices from an order, sum all of the prices in the array and return the total.

    public double getOrderTotal(double[] prices) {
        double sum = 0;
        
        for (double price:prices) {
            sum+= price;
        }
        return sum;

    }

// -----------------------------------------------------------------------------------

    // void displayMenu(ArrayList<String> menuItems)
    // Given an ArrayList of menu items (strings), print out each index and menu item.
    // Sample output given an ArrayList with the items "drip coffee", "cappuccino", "latte" and "mocha"
    
    public void displayMenu(ArrayList<String> menuItems) {

        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%s %s \n", i, menuItems.get(i));
        }
    }

// -----------------------------------------------------------------------------------

    // addCustomer(ArrayList<String> customers)
    // Print this string to the console: "Please enter your name:"
    // Then add this line of code to get user input from the terminal and store it in the variable userName:
    // String userName = System.console().readLine();copy
    // Next print the userName to the console, saying "Hello, [user name here]!"
    // Next print "There are ___ people in front of you" using the number for how many people are ahead of them (how many items already in the array)
    // Then, add the customer's name to the given customers list. And print the list.
    // No need to return anything.

// -----------------------------------------------------------------------------------

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s! ", userName);
        System.out.printf("There are %s people ahead of you.\n", customers.size());
        customers.add(userName);
        System.out.println(customers);
    }

// -----------------------------------------------------------------------------------

    // void printPriceChart(String product, double price, int maxQuantity)
    // Given a product, price and a maxQuantity, create a method that prints the cost for buying 1,
    // then the price for buying 2, then for 3.. and so on, up to the max. For example, 
    // if the product is "Columbian Coffee Grounds" with a price of 15.0 and maxQuantity of 3, you should print:

    public void printPriceChart(String product, double price, int maxQuantity) {

        System.out.printf("%s\n", product);
        for(int quantity = 1; quantity < maxQuantity; quantity++) {
            System.out.printf("%s - $%.2f\n", quantity, quantity * price);
        }
        
        System.out.println("");
    }

// -----------------------------------------------------------------------------------

    // Sensei bonus: Format the prices as currency.
    // Senpai Bonus: Take $0.50 more off of the original price every time the quantity increases.
    // Example: Given a $2.00 price and 4 max, where the prices would normally be $2, $4, $6 and $8,
    // the discount would yield $2, $3.50, $5, and $6.50, progressively taking off $0.50, then $1, then $1.50 from the group tag price:

    public void DiscountPriceChart(String product, double price, int maxQuantity) {

        System.out.printf("%s\n", product);
        for(int quantity = 1; quantity < maxQuantity; quantity++) {
            if (quantity == 1){
                System.out.printf("%s - $%.2f\n", quantity, quantity * price);
            }
            else if (quantity == 2){
                System.out.printf("%s - $%.2f\n", quantity, quantity * price - 0.50);
            }
            else if (quantity == 3){
                System.out.printf("%s - $%.2f\n", quantity, quantity * price - 1);
            }
            else if (quantity == 4){
                System.out.printf("%s - $%.2f\n", quantity, quantity * price - 1.50);
            }
        }
        System.out.println("");
        
    }    

// -----------------------------------------------------------------------------------

    // boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices)
    // Let's overload the display menu! Given 2 arrays, an ArrayList of menu items (strings), and an ArrayList of prices (doubles) print a menu!
    // However, first check: if the arrays are not the same size, immediately return false.
    // To print the menu, iterate from 0 to the last index. Each time through, print on the same line:
    // a.) The index, b.) The menu item at that index, and c.) The price at that index.

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        if(menuItems.size() != prices.size()) {
            return false;
        }
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%s %s -- $%.2f \n", i, menuItems.get(i), prices.get(i));
        }
        return true;
    }

// -----------------------------------------------------------------------------------
    
    // Sensei Bonus!
    // Make a method addCustomers where a barista can enter multiple customers.

    public void addCustomers(ArrayList<String> customers) {
        boolean finished = false;
        String input;
        while (!finished) {
            System.out.println("Please enter a customer name or press Q to quit:");
            input = System.console().readLine();
            if (input.equals("Q")) {
                finished = true;
                return;
            }
            else if (input.equals("q")) {
                finished = true;
                return;
            }
            customers.add(input);
            System.out.printf("%s was added to the list.", input);
            System.out.println(customers);
        }
    }
}