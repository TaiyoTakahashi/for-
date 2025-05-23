package FEM;
public class PermutationGenerator {
    public static void main(String[] args) {
        String input = "ABC";
        generate("", input);
    }

    static void generate(String prefix, String remaining) {
        if (remaining.isEmpty()) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < remaining.length(); i++) {
            char ch = remaining.charAt(i);
            String slice =remaining.substring(0, i);
            String subStr = remaining.substring(i + 1);
            String next = slice + subStr;
            generate(prefix + ch, next);
        }
    }
}