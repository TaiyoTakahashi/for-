package chatGPT_2_130問;
import java.util.ArrayList;

public class Q121_ListAddAndDisplay {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("佐藤");
        names.add("鈴木");
        names.add("田中");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
