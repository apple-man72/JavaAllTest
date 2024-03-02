package suanFa.leeCode;

public class 笨阶乘 {
    //笨阶乘
    public static int clumsy(int N) {
        if (N == 1) {
            return 1;
        } else if (N == 2) {
            return 2;
        } else if (N == 3) {
            return 6;
        } else if (N == 4) {
            return 7;
        }

        if (N % 4 == 0) {
            return N + 1;
        } else if (N % 4 <= 2) {
            return N + 2;
        } else {
            return N - 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(clumsy(7));
    }


}
