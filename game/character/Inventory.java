package game.character;

import java.util.ArrayList;
import java.util.List;

public class Inventory implements IInventory {
    private List<String> items = new ArrayList<>();

    @Override
    public void addItem(String item) {
        items.add(item);
        System.out.println("Añadido: " + item);
    }

    @Override
    public void removeItem(String item) {
        items.remove(item);
        System.out.println("Removido: " + item);
    }

    @Override
    public void listItems() {
        System.out.println("Inventario: " + items);
    }
}
