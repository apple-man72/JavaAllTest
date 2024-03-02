package functional;

public class Demo {
    public static void show(MyFunctionalInterface myFunctionalInterface){
        myFunctionalInterface.method();
    }

    public static void main(String[] args) {
        show(new MyFunctionalInterfaceImpl());
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("重写匿名内部类中的抽象方法！");
            }
        });
        show(() -> System.out.println("重写匿名内部类中的抽象方法！"));
    }
}
