package lambda.demo05Consumer;

import java.util.function.Consumer;

/*
    Consumer是一个消费接口
 */
public class Demo01Consumer {
    /*
           定义一个方法
           方法的参数传递一个字符串的姓名
           方法的参数传递一个Consumer接口，泛型使用String
           可以使用Consumer接口消费字符串的姓名
     */
    public static void method(String name, Consumer<String> con) {
        con.accept(name);
    }

    public static void main(String[] args) {
        //调用method方法
        method("热巴",(String name)->{
//            System.out.println(name);//直接输出
            String reName = new StringBuilder(name).reverse().toString();
            System.out.println(reName);

        });
        //对传递的字符串消费
    }
}
