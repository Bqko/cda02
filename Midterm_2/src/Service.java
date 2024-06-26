public class Service {
    private String name;
    private double price;
    private int duration; // duration in minutes

    // Constructor
    public Service(String name, double price, int duration) {
        this.name = name;
        this.price = price;
        this.duration = duration;
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    // toString method for easy printing of Service object
    @Override
    public String toString() {
        return "Service{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", duration=" + duration +
                '}';
    }
}
