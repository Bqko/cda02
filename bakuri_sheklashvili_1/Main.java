package quizes.q3.bakuri_sheklashvili_1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating instances of PersonManager and HotelManager
        PersonManager personManager = new PersonManager();
        HotelManager hotelManager = new HotelManager();

        // Getting list of persons
        List<Person> persons = personManager.getPersons();

        // Creating a new person with your name and surname
        Person myself = new Person();
        myself.setName("Bakuri");
        myself.setSurname("Sheklashvili");
        myself.setId("1234567890"); // You can set any unique ID

        // Checking-in the person with your name and surname
        Room room = new Room("405"); // Assuming room number is "101"
        hotelManager.checkIn(myself, room);

        // Checking-in another person from the list in the same room
        if (!persons.isEmpty()) {
            Person randomPerson = persons.get(0); // Selecting the first person from the list
            hotelManager.checkIn(randomPerson, room);
        }

        // Printing hotel guests and room information
        hotelManager.displayInfo();
    }
}
