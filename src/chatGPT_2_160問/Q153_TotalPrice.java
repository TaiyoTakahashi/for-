package chatGPT_2_160問;
import java.util.ArrayList;


public class Q153_TotalPrice {
    public static void main(String[] args) {
        ArrayList<Item> cart = new ArrayList<>();
        cart.add(new Item("本", 1200));
        cart.add(new Item("鉛筆", 100));
        cart.add(new Item("ノート", 300));

        int total = 0;
        for (Item item : cart) {
            total += item.price;
        }

        System.out.println("合計金額: " + total + "円");
    }
}
