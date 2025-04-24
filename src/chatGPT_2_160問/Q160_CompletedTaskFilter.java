package chatGPT_2_160問;
import java.util.ArrayList;

class Task {
    String title;
    boolean completed;

    Task(String title, boolean completed) {
        this.title = title;
        this.completed = completed;
    }
}

public class Q160_CompletedTaskFilter {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task("レポート提出", true));
        tasks.add(new Task("会議資料作成", false));
        tasks.add(new Task("メール返信", true));

        System.out.println("完了済みのタスク:");
        for (Task t : tasks) {
            if (t.completed) {
                System.out.println("- " + t.title);
            }
        }
    }
}
