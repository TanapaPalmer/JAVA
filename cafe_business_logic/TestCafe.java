import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCafe {
    public static void main(String[] args) {

        CafeUtil appTest = new CafeUtil();


        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", appTest.getStreakGoal());

// -----------------------------------------------------------------------------------

        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", appTest.getStreakGoalBonus());

// -----------------------------------------------------------------------------------

        System.out.println("----- Order Total Test-----");
        double[] prices = {4.20, 3.80, 3.50};
        System.out.printf("Order total: %s \n\n",appTest.getOrderTotal(prices));
        
// -----------------------------------------------------------------------------------

        System.out.println("----- Display Menu Test-----");
        
        List<String> loadMenu = Arrays.asList(
            "drip coffee",
            "cappucino",
            "latte",
            "mocha"
        );
        ArrayList<String> menu = new ArrayList<String>();
        menu.addAll(loadMenu);
        appTest.displayMenu(menu);
    
// -----------------------------------------------------------------------------------
    
        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();

        for (int i = 0; i < 3; i++) {
            appTest.addCustomer(customers);
            System.out.println("\n");
        }

// -----------------------------------------------------------------------------------

        System.out.println("----- Columbian Coffee Grounds-----");
        appTest.printPriceChart("",15, 4);

// -----------------------------------------------------------------------------------

        System.out.println("----- Discounts for new Members -----");
        appTest.DiscountPriceChart("",2, 5);

// -----------------------------------------------------------------------------------

        System.out.println("----- Display Menu NINJA BONUS-----");
        List<Double> MenuPrices = Arrays.asList(4.50, 3.50, 3.80, 4.00);
        ArrayList<Double> pricesOfCoffee = new ArrayList<Double>();
        
        pricesOfCoffee.addAll(MenuPrices);
        appTest.displayMenu(menu, pricesOfCoffee);

// -----------------------------------------------------------------------------------

        System.out.println("\n----- Adding Customers-----");
        ArrayList<String> newCustomers = new ArrayList<String>();

        appTest.addCustomers(newCustomers);

    }
}