package threadSafe.threadSafe03Lock;

/**
 * 实现卖票案例
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 卖票案例出现了线程安全问题：卖出了不存在的和重复的
 * 解决线程安全的第三种方案：使用Lock锁、
 * java.util.concurrent.locks.lock接口
 * Lock接口中的方法:lock()  unlock()          ReentrantLock实现了lock接口
 * 使用步骤：
 * 1.在成员位置创建一个ReentrantLock对象
 * 2.在可能出现安全问题的代码前调用lock接口中的方法lock获取锁
 * 3.在可能出现安全问题的代码前调后lock接口中的方法lock释放锁
 */
public class RunnableImpl implements Runnable {
    //    定义一个多个线程共享的票源
    private int ticket = 100;
    // 1.在成员位置创建一个ReentrantLock对象
    Lock l = new ReentrantLock();

    //    实现线程任务 目的是卖票
    @Override
    public void run() {
//        使用死循环，让卖票操作重复执行
        while (true) {
//            2.在可能出现安全问题的代码前调用lock接口中的方法lock获取锁
            l.lock();

            //        先判断票是否存在
            if (ticket > 0) {
//                票存在 卖票 ticker--

                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票！");
                ticket--;
                l.unlock();
            }
        }


    }
}
