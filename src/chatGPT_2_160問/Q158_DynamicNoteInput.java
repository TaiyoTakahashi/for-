package chatGPT_2_160問;
import java.util.ArrayList;
import java.util.Scanner;

class Note {
    String text;
    Note(String text) {
        this.text = text;
    }
}

public class Q158_DynamicNoteInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Note> notes = new ArrayList<>();

        while (true) {
            System.out.print("メモを入力（終了→end）: ");
            String line = sc.nextLine();
            if (line.equals("end")) break;
            notes.add(new Note(line));
        }

        System.out.println("--- 入力内容 ---");
        for (Note n : notes) {
            System.out.println(n.text);
        }
    }
}
