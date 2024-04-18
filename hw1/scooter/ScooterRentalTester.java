package homeworks.hw1.scooter;

import java.util.Timer;
import java.util.TimerTask;

/**
 * A class to test the rental and return of scooters from a rental company.
 */
public class ScooterRentalTester {

    /**
     * The main method to simulate the journey, scooter rental, and return.
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Print a message indicating that the journey to the university is starting
        System.out.println("Starting journey to the university...");

        // Create a rental company
        RentalCompany rentalCompany = new RentalCompany();

        // Add a scooter to the rental company
        Scooter scooter = new Scooter();
        scooter.setModel("Sparrow X10");
        rentalCompany.addScooter(scooter);

        // Schedule arriving at university
        Timer timer1 = new Timer();
        timer1.schedule(new TimerTask() {
            @Override
            public void run() {
                // Simulate arriving at the university
                System.out.println("Arrived at the university.");
                // Rent the scooter after 1 hour
                rentScooterAfterOneHour(rentalCompany, scooter);
                timer1.cancel(); // Stop the timer after executing the task
            }
        }, 60 * 60 * 1000); // 1 hour

        // Schedule returning home and leaving the scooter near home after 2 hours
        Timer timer2 = new Timer();
        timer2.schedule(new TimerTask() {
            @Override
            public void run() {
                // Simulate returning home and leaving the scooter near home after 2 hours
                returnHomeAndLeaveScooter(rentalCompany, scooter);
                timer2.cancel(); // Stop the timer after executing the task
            }
        }, 2 * 60 * 60 * 1000); // 2 hours
    }

    /**
     * Rents the scooter after one hour of arriving at the university.
     * @param rentalCompany The rental company from which the scooter is rented.
     * @param scooter The scooter being rented.
     */
    private static void rentScooterAfterOneHour(RentalCompany rentalCompany, Scooter scooter) {
        // Rent the scooter after 1 hour
        rentalCompany.rentScooter(scooter.getId());
        System.out.println("Scooter rented after 1 hour.");
    }

    /**
     * Returns home and leaves the scooter near home after two hours of the journey.
     * @param rentalCompany The rental company to which the scooter is returned.
     * @param scooter The scooter being returned.
     */
    private static void returnHomeAndLeaveScooter(RentalCompany rentalCompany, Scooter scooter) {
        // Return home and leave the scooter near home after 2 hours
        rentalCompany.returnScooter(scooter.getId(), 41.794432, 44.810762);
        System.out.println("Scooter returned and left near home after 2 hours.");
    }
}