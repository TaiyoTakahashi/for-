package chatGPT_2_130問;
import java.util.ArrayList;

public class Q123_ListRemoveItem {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");

        list.remove("banana");

        for (String item : list) {
            System.out.println(item);
        }
    }
}
