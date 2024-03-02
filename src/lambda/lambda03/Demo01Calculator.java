package lambda.lambda03;

public class Demo01Calculator {
    public static void main(String[] args) {

        invokeCal(10, 20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });

        invokeCal(120,230,(a,b)-> a+b);

        invokeCal(10, 20, (int a, int b) -> {
            return a + b;
        });
    }

    public static void invokeCal(int a, int b, Calculator calculator) {
        int sum = calculator.calc(a, b);
        System.out.println(sum);

    }
}
