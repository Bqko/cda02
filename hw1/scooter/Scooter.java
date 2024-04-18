package homeworks.hw1.scooter;

/**
 * Represents a scooter available for rental.
 */
public class Scooter {

    // Unique identifier for the scooter.
    int id;

    // Model name of the scooter (e.g., Sparrow X10).
    String model;

    // Current battery level (percentage).
    int batteryLevel;

    // Scooter location;
    double x, y;

    // Indicates if the scooter is available
    boolean available;

    /**
     * Retrieves the unique identifier of the scooter.
     * @return The scooter's ID.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the unique identifier of the scooter.
     * @param id The scooter's ID.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retrieves the model name of the scooter.
     * @return The scooter's model name.
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the model name of the scooter.
     * @param model The scooter's model name.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Retrieves the battery level of the scooter.
     * @return The scooter's battery level.
     */
    public int getBatteryLevel() {
        return batteryLevel;
    }

    /**
     * Sets the battery level of the scooter.
     * @param batteryLevel The scooter's battery level.
     */
    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    /**
     * Retrieves the latitude of the scooter's location.
     * @return The latitude of the scooter's location.
     */
    public double getX() {
        return x;
    }

    /**
     * Sets the latitude of the scooter's location.
     * @param x The latitude of the scooter's location.
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Retrieves the longitude of the scooter's location.
     * @return The longitude of the scooter's location.
     */
    public double getY() {
        return y;
    }

    /**
     * Sets the longitude of the scooter's location.
     * @param y The longitude of the scooter's location.
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Checks if the scooter is available for rental.
     * @return True if the scooter is available, false otherwise.
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Sets the availability status of the scooter.
     * @param available True if the scooter is available, false otherwise.
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     * Returns a string representation of the scooter.
     * @return A string containing the scooter's details.
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Scooter{");
        sb.append("id=").append(id);
        sb.append(", model='").append(model).append('\'');
        sb.append(", batteryLevel=").append(batteryLevel);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append(", available=").append(available);
        sb.append('}');
        return sb.toString();
    }
}
