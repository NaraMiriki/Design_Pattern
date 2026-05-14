package Behavioural_pattern.ex2;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class InStockIterator implements Iterator<Item> {
    private List<Item> inventoryList;
    private int currentIndex = 0;

    public InStockIterator(List<Item> inventoryList) {
        this.inventoryList = inventoryList;
    }

    @Override
    public boolean hasNext() {
        // Tìm phần tử tiếp theo thỏa mãn điều kiện còn hàng
        while (currentIndex < inventoryList.size()) {
            if (inventoryList.get(currentIndex).isInStock()) {
                return true;
            }
            currentIndex++;
        }
        return false;
    }

    @Override
    public Item next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return inventoryList.get(currentIndex++);
    }
}