package waitAndNotify;

/**
 * 等待唤醒案例
 * 1.创建一个顾客线程（消费者）：告知老板要的包子的种类和数量，调用wait方法，放弃CPU的
 * 执行，进入到waiting状态（无限等待）
 * 2.创建一个老板线程（生产者）：花了5秒做包子，做好包子之后，调用notify方法，唤醒顾客吃包子
 * <p>
 * 注意事项：顾客老板线程必须使用同步代码块包起来，保证等待和唤醒只能有一个在执行
 * 同步使用的锁对象必须保证唯一
 * 只有锁对象才能调用wait和notify方法
 */
public class WaitAndNotify01 {
    public static void main(String[] args) {
//        创建锁对象，保证唯一
        Object obj = new Object();
//        创建一个顾客线程（消费者)
        new Thread() {
            @Override
            public void run() {
                synchronized (obj) {
                    System.out.println("告知老板要的包子的种类和数量");
//                    调用wait方法，放弃CPU的执行，进入到waiting状态（无限等待）
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
//                    唤醒之后执行的代码
                    System.out.println("包子已经做好了，开吃");
                }
            }
        }.start();
//         2.创建一个老板线程（生产者）
        new Thread() {
            @Override
            public void run() {
//                花了5秒做包子
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj) {
                    System.out.println("老板五秒钟之后做好包子，告知顾客，可以吃包子了");
                    obj.notify();
                }
            }
        }.start();

    }
}
