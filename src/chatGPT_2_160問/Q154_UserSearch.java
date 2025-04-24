package chatGPT_2_160問;
import java.util.ArrayList;
import java.util.Scanner;

class User {
    int id;
    String name;

    User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Q154_UserSearch {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(101, "田中"));
        users.add(new User(102, "佐藤"));

        Scanner sc = new Scanner(System.in);
        System.out.print("検索するID: ");
        int target = sc.nextInt();

        for (User u : users) {
            if (u.id == target) {
                System.out.println("名前: " + u.name);
                return;
            }
        }
        System.out.println("見つかりませんでした");
    }
}
