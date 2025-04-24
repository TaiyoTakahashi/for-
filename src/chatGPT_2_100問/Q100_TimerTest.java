package chatGPT_2_100問;
class Timer {
    static int elapsedSeconds = 0;

    static void tick() {
        elapsedSeconds++;
    }

    static void showTime() {
        System.out.println("経過時間: " + elapsedSeconds + "秒");
    }
}

public class Q100_TimerTest {
    public static void main(String[] args) {
        Timer.tick();
        Timer.tick();
        Timer.tick();
        Timer.showTime();  // 経過時間: 3秒
    }
}
