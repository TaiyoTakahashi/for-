package chatGPT_2_160問;
import java.util.ArrayList;
import java.util.Scanner;

class Product {
    String name;
    int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

public class Q150_ProductSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product("パン", 100));
        list.add(new Product("牛乳", 150));

        System.out.print("検索したい商品名: ");
        String keyword = sc.nextLine();

        boolean found = false;
        for (Product p : list) {
            if (p.name.equals(keyword)) {
                System.out.println("価格: " + p.price + "円");
                found = true;
            }
        }

        if (!found) {
            System.out.println("見つかりませんでした");
        }
    }
}
