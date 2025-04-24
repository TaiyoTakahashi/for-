package chatGPT_2_130問;
import java.util.ArrayList;

public class Q125_ListContains {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("dog");
        list.add("cat");
        list.add("bird");

        String target = "cat";

        if (list.contains(target)) {
            System.out.println(target + " はリストに含まれています。");
        } else {
            System.out.println(target + " は含まれていません。");
        }
    }
}
