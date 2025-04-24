package chatGPT_2_130問;
import java.util.ArrayList;

public class Q127_ListReversePrint {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");

        for (int i = items.size() - 1; i >= 0; i--) {
            System.out.println(items.get(i));
        }
    }
}
