package chatGPT_2_130問;
import java.util.ArrayList;

public class Q130_ListUpperCase {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("hello");
        list.add("world");

        for (String word : list) {
            System.out.println(word.toUpperCase());
        }
    }
}
