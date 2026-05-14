package Behavioural_pattern.ex2;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory implements Iterable<Item> {
    private List<Item> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    @Override
    public Iterator<Item> iterator() {
        // Trả về instance của InStockIterator theo đúng thiết kế UML
        return new InStockIterator(this.items);
    }
}
