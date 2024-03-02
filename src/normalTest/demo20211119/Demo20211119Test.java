package normalTest.demo20211119;

public class Demo20211119Test {
//    Class c1 = Test.class; 这说明任何一个类都有一个隐含的静态成员变量class，这种方式是通过获取类的静态成员变量class得到的
//    Class c2 = test.getClass(); test是Test类的一个对象，这种方式是通过一个类的对象的getClass()方法获得的
//    Class c3 = Class.forName("com.catchu.me.reflect.Test"); 这种方法是Class类调用forName方法，通过一个类的全量限定名获得
public static void main(String[] args) {
    String s = "2018-01-06";
    System.out.println(s.substring(0,4));

}
}
