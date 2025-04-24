package chatGPT_2_100問;
class InstanceCounter {
    static int count = 0;

    InstanceCounter() {
        count++;
    }

    static void showCount() {
        System.out.println("インスタンス数: " + count);
    }
}

public class Q093_StaticCountTest {
    public static void main(String[] args) {
        new InstanceCounter();
        new InstanceCounter();
        new InstanceCounter();
        InstanceCounter.showCount();
    }
}
