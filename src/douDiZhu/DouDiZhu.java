package douDiZhu;

import java.util.ArrayList;

/*
        斗地主综合案例
        1.准备牌
        2.洗牌
        3.发牌
        4.看牌

 */
public class DouDiZhu {
    public static void main(String[] args) {
        //1.准备牌
        //定义一个存储54张牌的ArrayList集合，泛型使用String
        ArrayList<String> poker = new ArrayList<>();
        //定义两个数组，一个存储牌的花色，一个存储牌的序号
        String[] colors = {"♠","♥","♦","♣"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        //先把大王小王存储到poker集合中
        poker.add("大王");
        poker.add("小王");
        //循环嵌套遍历两个数组，让其组成54张牌
        for (String number : numbers){
            for (String color : colors){
                System.out.println(number+color);
            }
        }

    }
}
