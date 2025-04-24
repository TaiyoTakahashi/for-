package chatGPT_1_30問;
public class Q027_ArrayAverage {
    public static void main(String[] args) {
        int[] scores = {80, 75, 90, 60};
        double sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double average = sum / scores.length;
        System.out.println("平均: " + average);
    }
}
