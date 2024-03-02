package JVM;
public class StactErrorTest {
    private static int count = 1;
    public static void main(String[] args) {

        //默认情况下count:11401
//        设置栈的大小：-Xss256k

        System.out.println(count);
        count++;
        main(args);
    }
}
