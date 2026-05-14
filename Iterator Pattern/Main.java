package Behavioural_pattern.ex2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo Inventory (Container)
        Inventory inventory = new Inventory();
        inventory.addItem(new Item("Laptop Gaming", true));
        inventory.addItem(new Item("Bàn phím cơ (Hết hàng)", false));
        inventory.addItem(new Item("Chuột không dây", true));
        inventory.addItem(new Item("Màn hình 4K (Hết hàng)", false));
        inventory.addItem(new Item("Tai nghe Bluetooth", true));

        System.out.println("--- DANH SÁCH SẢN PHẨM CÒN HÀNG (Sử dụng Iterator) ---");
        
        // Cách 1: Dùng Iterator trực tiếp như UML mô tả
        Iterator<Item> it = inventory.iterator();
        while (it.hasNext()) {
            System.out.println("+ " + it.next().getName());
        }

        /* 
        // Cách 2: Vì Inventory đã implements Iterable, ta có thể dùng for-each
        for (Item item : inventory) {
            System.out.println("+ " + item.getName());
        }
        */
    }
}
