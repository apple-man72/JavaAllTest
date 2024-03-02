package lambda.demo03LambdaTest;
/*
        lambda表达式练习：
      例如Java.lang.runnable接口就是一个函数式接口
      假设有一个startThread方法使用

 */
public class Demo01Runnable {
    public static void startThread(Runnable run){
        //开启多线程
        new Thread(run).start();
    }

    public static void main(String[] args) {
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"--->"+"线程启动了");
            }
        });

        startThread(()-> System.out.println(Thread.currentThread().getName()+"--->"+"线程启动了"));
    }
}
