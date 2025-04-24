package chatGPT_2_130問;
import java.util.ArrayList;

public class Q128_ListEvenOnly {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(6);
        numbers.add(7);
        numbers.add(10);

        for (int n : numbers) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        }
    }
}
