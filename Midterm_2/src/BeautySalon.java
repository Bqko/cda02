import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BeautySalon {
    private String name;
    private List<Service> services;

    // Constructor
    public BeautySalon(String name) {
        this.name = name;
        this.services = new ArrayList<>();
    }

    // Getter and setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter method for services
    public List<Service> getServices() {
        return services;
    }

    // Method to add a service
    public void addService(Service service) {
        this.services.add(service);
    }

    // Method to remove a service
    public boolean removeService(Service service) {
        return this.services.remove(service);
    }

    // Method to remove a service by its name
    public boolean removeServiceByName(String serviceName) {
        for (Service service : services) {
            if (service.getName().equals(serviceName)) {
                return services.remove(service);
            }
        }
        return false;
    }

    // Method to save the current state to a file
    public void saveState() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("state.csv"))) {
            for (Service service : services) {
                // Write each service's details to a line in the file
                writer.write(service.getName() + "," + service.getPrice() + "," + service.getDuration());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to restore the state from a file
    public void restoreState() {
        services.clear(); // Clear current state
        try (BufferedReader reader = new BufferedReader(new FileReader("state.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    // Parse service details from file and add to services list
                    String name = parts[0];
                    double price = Double.parseDouble(parts[1]);
                    int duration = Integer.parseInt(parts[2]);
                    services.add(new Service(name, price, duration));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // toString method for easy printing of BeautySalon object
    @Override
    public String toString() {
        return "BeautySalon{" +
                "name='" + name + '\'' +
                ", services=" + services +
                '}';
    }

    // Main method for testing

}
