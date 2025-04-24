package chatGPT_2_160問;
import java.util.ArrayList;

class Item {
    String name;
    int price;

    Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println(name + ": " + price + "円");
    }
}

public class Q149_ItemList {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("りんご", 120));
        items.add(new Item("バナナ", 150));
        items.add(new Item("みかん", 100));

        for (Item i : items) {
            i.display();
        }
    }
}
