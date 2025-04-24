package chatGPT_1_10問;
public class Q008_ArrayAverage {
    public static void main(String[] args) {
        int[] scores = {70, 85, 90, 60, 100};
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        System.out.println("平均点: " + (sum / (double)scores.length));
    }
}
