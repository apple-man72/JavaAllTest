package lambda.lambda01;

public class Cook {
    public static void main(String[] args) {
        invokeCook(() -> System.out.println("吃飯了"));
    }

    public static void invokeCook(MakeFood makeFood) {
        makeFood.makeFood();
    }
}
