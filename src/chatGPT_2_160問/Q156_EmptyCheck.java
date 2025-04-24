package chatGPT_2_160問;
import java.util.ArrayList;

class Entry {
    String data;
    Entry(String data) {
        this.data = data;
    }
}

public class Q156_EmptyCheck {
    public static void main(String[] args) {
        ArrayList<Entry> entries = new ArrayList<>();

        if (entries.isEmpty()) {
            System.out.println("リストは空です");
        } else {
            System.out.println("要素があります");
        }
    }
}
