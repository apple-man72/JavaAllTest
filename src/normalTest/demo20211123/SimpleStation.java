package normalTest.demo20211123;

/**
 * @author ljp * @date 2021年11月23日 16:12
 */

public class SimpleStation {
    private static int ticks = 20;
    public static void main(String[] args) {
        while (ticks > 0) {
            if (ticks == 15) {
                // 这里模拟售票机器故障
                throw new RuntimeException("machine down...");
            }
            ticks --;
            System.out.println("卖了一张票，还剩下：" + ticks + "张票");
        }
    }
}
