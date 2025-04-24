package chatGPT_2_160問;
import java.util.ArrayList;
import java.util.Comparator;



public class Q155_SortByName {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("山田"));
        list.add(new Person("井上"));
        list.add(new Person("佐藤"));

        list.sort(Comparator.comparing(p -> p.name));

        for (Person p : list) {
            System.out.println(p.name);
        }
    }
}
