public class Tester {
    public static void main(String[] args) {
        // Create a BeautySalon instance
        BeautySalon salon = new BeautySalon("Glamour Beauty Salon");

        // Add services
        Service haircut = new Service("Haircut", 25.00, 30);
        Service manicure = new Service("Manicure", 15.00, 45);
        salon.addService(haircut);
        salon.addService(manicure);

        // Print state before saving
        System.out.println("Before saving state:");
        System.out.println(salon);

        // Save state
        salon.saveState();

        // Remove services
        salon.removeService(haircut);
        salon.removeService(manicure);

        // Print state after removal
        System.out.println("After removing services:");
        System.out.println(salon);

        // Restore state
        salon.restoreState();

        // Print state after restoring
        System.out.println("After restoring state:");
        System.out.println(salon);
    }
}
