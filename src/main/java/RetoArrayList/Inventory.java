package RetoArrayList;
import java.util.ArrayList;
import java.util.Optional;

public class Inventory {
    private final ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        this.items.add(item);
    }

    public boolean removeItem(String itemName) {
        for (Item item : items) {
            if(item.getName().equals(itemName)) {
                return this.items.remove(item);
            }
        }
            return false;
    }

    public Item findItem(String itemName) {
        for(Item item : items) {
            if (item.getName() == itemName) {
                return item;
            }
        }
        return null;
    }

    public double getTotalWeight() {
        double weight = 0;
        for (Item item : items) {
            weight += item.getWeight();
        }
        return weight;
    }

    // Este getter no es necesario modificarlo
    public ArrayList<Item> getItems() {
        return items;
    }
}
