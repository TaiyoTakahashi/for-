package chatGPT_1_90問;
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
}

public class Q083_CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("和: " + calc.add(5, 7));
    }
}
