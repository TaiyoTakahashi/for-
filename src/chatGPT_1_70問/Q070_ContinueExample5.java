package chatGPT_1_70問;
public class Q070_ContinueExample5 {
    public static void main(String[] args) {
        String[] words = {"apple", "", null, "banana", "cherry"};

        for (String word : words) {
            if (word == null || word.isEmpty()) continue;
            System.out.println(word);
        }
    }
}
