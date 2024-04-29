package task3;

import java.util.ArrayList;
import java.util.List;

public class DigitalMediaCollection {
    private List<DigitalMedia> collection = new ArrayList<>();

    public void addItem(DigitalMedia mediaItem) {
        collection.add(mediaItem);
    }

    public boolean removeItem(DigitalMedia mediaItem) {
        return collection.remove(mediaItem);
    }

    public void printCollection() {
        if (collection.isEmpty()) {
            System.out.println("The collection is empty");
        } else {
            for (DigitalMedia item : collection) {
                System.out.println(item.getCreator() + ", " + item.getTitle());
                System.out.println();
            }
        }
    }
}
