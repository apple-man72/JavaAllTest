package threadSafe.threadSafe02;

/**
 * 模拟卖票案例，
 * 创建三个线程，同时开启，对共享的票同时出售
 */
public class Ticket {
    public static void main(String[] args) {
//        创建Runnable接口的实现类对象
        Runnable runnable = new RunnableImpl();
//        创建Thread类的对象，构造方法中传Runnable接口的实现类对象
        Thread t0 = new Thread(runnable);
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t0.start();
        t1.start();
        t2.start();
    }
}
