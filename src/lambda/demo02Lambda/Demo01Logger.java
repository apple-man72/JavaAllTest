package lambda.demo02Lambda;
/*
           日志案例
       发现以下代码存在着一些性能浪费问题
 */
public class Demo01Logger {
    public static void showLog(int level, String message) {
        //对日志登记进行判断，如果是1，那么输出日志信息
        if (level == 1) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        //定义三个日志信息
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";
        showLog(1, msg1 + msg2 + msg3);

    }
}
