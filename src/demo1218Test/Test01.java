package demo1218Test;

public class Test01 {
    public static void main(String[] args) {
        MyClass<String> my = new MyClass<>();
        my.print("hello");

        MyClass<Integer> my2 = new MyClass<>();
        my2.print(3);

        System.out.println("==============");

        MyInterImpl<String> myInter = new MyInterImpl<>();
        myInter.print("World");
    }
}
