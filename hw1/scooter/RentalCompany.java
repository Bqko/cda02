package homeworks.hw1.scooter;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a rental company that manages a fleet of scooters.
 */
public class RentalCompany {

    private int uid = 0;

    List<Scooter> scooters = new ArrayList<>();

    /**
     * Returns a list of available scooters in the rental company.
     * @return A list of available scooters.
     */
    public List<Scooter> availableScooters() {
        List<Scooter> result = new ArrayList<>();
        for (Scooter scooter: scooters) {
            if (scooter.isAvailable()) {
                result.add(scooter);
            }
        }
        return result;
    }

    /**
     * Adds a scooter to the rental company.
     * @param scooter The scooter to add.
     */
    public void addScooter(Scooter scooter) {
        scooter.setId(uid++);
        scooters.add(scooter);
    }

    /**
     * Removes a scooter from the rental company.
     * @param id The ID of the scooter to remove.
     * @return True if the scooter was successfully removed, false otherwise.
     */
    public boolean removeScooter(int id) {
        boolean removed = false;
        for (Scooter scooter: scooters) {
            if (scooter.getId() == id) {
                scooters.remove(scooter);
                removed = true;
                break;
            }
        }
        return removed;
    }

    /**
     * Rents a scooter from the rental company.
     * @param id The ID of the scooter to rent.
     */
    public void rentScooter(int id) {
        for (Scooter scooter : scooters) {
            if (scooter.getId() == id && scooter.isAvailable()) {
                scooter.setAvailable(false);
                // You might want to perform other actions here like updating rental records.
                break;
            }
        }
    }

    /**
     * Returns a rented scooter to the rental company.
     * @param id The ID of the scooter to return.
     * @param x The latitude of the return location.
     * @param y The longitude of the return location.
     */
    public void returnScooter(int id, double x, double y) {
        for (Scooter scooter : scooters) {
            if (scooter.getId() == id && !scooter.isAvailable()) {
                scooter.setAvailable(true);
                scooter.setX(x); // Assuming your Scooter class has latitude and longitude fields
                scooter.setY(y);
                // You might want to calculate rental duration and update rental records here.
                break;
            }
        }
    }

    /**
     * Displays information about all scooters in the rental company.
     */
    public void displayAllScooters() {
        for (Scooter scooter : scooters) {
            System.out.println(scooter); // Assuming Scooter class has a meaningful toString method
        }
    }
}
