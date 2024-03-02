package lambda.demo02Lambda;

/*
            使用lambda优化日志案例
            lambda使用前提，必须存在函数式接口
 */
public class Demo02Lambda {
    //定义一个显示日志的方法，方法的参数传递日志的等级和messageBuilder接口
    public static void showLog(int level, MessageBuilder mb) {
        if (level == 1) {
            System.out.println(mb.builderMessage());
        }
    }

    public static void main(String[] args) {
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";
        showLog(2, () -> msg1 + msg2 + msg3);
    }
}
