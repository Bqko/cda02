package bakuri_sheklashvili_1.superposition;

public class CoffeeShop {

    public static void main(String[] args) {
        int pricePerCoffee = 250; // tetri
        int numCoffeeSold = 100;
        int totalCostOfBeans = 15000; // tetri

        // Additional expenses
        int tax = 41 * 100; // Convert lari to tetri
        int water = 42;
        int gas = 230;
        int electricity = 29 * 100; // Convert lari to tetri
        int parking = 51 * 100; // Convert lari to tetri

        int otherExpenses = tax + water + gas + electricity + parking;

        // Calculate total expenses
        int totalExpenses = totalCostOfBeans + otherExpenses;

        // Calculate profit
        double profit = calculateProfit(pricePerCoffee, numCoffeeSold, totalExpenses);

        System.out.println("Total Expenses: " + totalExpenses + " tetri");
        System.out.println("Profit: " + profit + " lari");
    }

    public static double calculateProfit(int pricePerCoffee, int numCoffeeSold, int totalExpenses) {
        // Calculate total revenue
        int totalRevenue = pricePerCoffee * numCoffeeSold;

        // Calculate profit in tetri
        int profitInTetri = totalRevenue - totalExpenses;

        // Convert profit from tetri to lari
        double profitInLaris = profitInTetri / 100.0; // 1 lari = 100 tetri

        return profitInLaris;
    }
}
