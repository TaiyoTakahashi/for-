package chatGPT_1_50問;
public class Q046_PrimeKuku {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                int result = i * j;
                if (isPrime(result)) {
                    System.out.println(i + "×" + j + "=" + result);
                }
            }
        }
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
