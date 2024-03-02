package normalTest.demo20211123;

/**
 * @author ljp * @date 2021年11月23日 13:24
 */

public class PearlMilkTeaTest {
    public static void main(String[] args) {
        PearlMilkTea pearlMilkTea = PearlMilkTea.LARGE;
        drinkSize((pearlMilkTea));
    }
    public  static void  drinkSize(PearlMilkTea pearlMilkTea){
        if (pearlMilkTea == PearlMilkTea.LARGE) {
            System.out.println("我为女朋友买了一大杯珍珠奶茶！");
        } else if (pearlMilkTea == PearlMilkTea.MEDIUM) {
            System.out.println("我为女朋友买了一中杯珍珠奶茶！");
        } else {
            System.out.println("我为女朋友买了一小杯珍珠奶茶！");

        }
    }
}

