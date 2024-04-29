package task3;

public class MediaCollectionTester {
    public static void main(String[] args) {
        DigitalMedia movie1 = new DigitalMedia();
        movie1.setTitle("Inception");
        movie1.setCreator("Christopher Nolan");

        DigitalMedia music1 = new DigitalMedia();
        music1.setTitle("Abbey Road");
        music1.setCreator("The Beatles");

        DigitalMediaCollection dmc = new DigitalMediaCollection();

        dmc.addItem(movie1);
        dmc.addItem(music1);
        dmc.addItem(movie1); // Adding duplicate to test

        dmc.removeItem(movie1); // Removing one instance of Inception

        dmc.printCollection();
    }
}
