package lambda.lambda04;

public class Demo02Lambda {
    public static void main(String[] args) {
        //使用匿名内部类的方式创建多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "新线程被创建了！");
            }
        }).start();


        new Thread(() -> System.out.println(Thread.currentThread().getName() + "新线程被创建了！")).start();
    }
}
