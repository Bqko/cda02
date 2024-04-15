package quizes.q3.bakuri_sheklashvili_1;

import java.util.*;

public class HotelManager {
    private Map<String, Room> guestRooms;

    public HotelManager() {
        this.guestRooms = new HashMap<>();
    }

    // Method to check-in a guest
    public void checkIn(Person guest, Room room) {
        guestRooms.put(guest.getId(), room);
        System.out.println(guest.getName() + " " + guest.getSurname() + " checked in to room " + room.getRoomNumber());
    }

    // Method to check-out a guest
    public void checkOut(Person guest) {
        Room room = guestRooms.remove(guest.getId());
        if (room != null) {
            System.out.println(guest.getName() + " " + guest.getSurname() + " checked out from room " + room.getRoomNumber());
        } else {
            System.out.println("Guest not found.");
        }
    }

    // Method to display information about all guests and their rooms
    public void displayInfo() {
        System.out.println("Guest Information:");
        for (Map.Entry<String, Room> entry : guestRooms.entrySet()) {
            String guestId = entry.getKey();
            Room room = entry.getValue();
            System.out.println("Guest ID: " + guestId + ", Room Number: " + room.getRoomNumber());
        }
    }
}
