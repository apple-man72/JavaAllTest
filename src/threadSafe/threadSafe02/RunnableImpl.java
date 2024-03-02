package threadSafe.threadSafe02;

/**
 * 实现卖票案例
 */

/**
 * 卖票案例出现了线程安全问题：卖出了不存在的和重复的
 * 解决线程安全的第二种方案：使用同步方法
 * 使用步骤：
 * 1.把访问了共享数据的代码抽取出来，放到一个方法中
 * 2.在方法上添加synchronize修饰符
 * 格式：定义方法的格式
 * 修饰符 synchronize 返回值类型 方法名（参数列表）{
 * 可能会出现线程安全的代码（访问了共享数据的代码）
 * }
 */
public class RunnableImpl implements Runnable {
    //    定义一个多个线程共享的票源
    private int ticket = 100;
    //创建一个锁对象
    Object obj = new Object();

    //    实现线程任务 目的是卖票
    @Override
    public void run() {
//        使用死循环，让卖票操作重复执行
        while (true) {
            payTickets();
        }
    }

    //   定义一个同步方法
    public synchronized void payTickets() {
        //        先判断票是否存在
        if (ticket > 0) {
//                票存在 卖票 ticker--
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票！");
            ticket--;
        }
    }
}
