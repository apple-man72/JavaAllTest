package stream.Demo01Stream;

import java.util.ArrayList;
import java.util.List;

public class Demo01List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        //对list集合进行遍历，张开头的到一个新集合中
        List<String> listA = new ArrayList<>();
        for (String i : list) {
            if (i.startsWith("张")) {
                listA.add(i);
            }
        }
        //对listA集合进行遍历，只要姓名长度为3的人，存到一个新集合中
        List<String> listB = new ArrayList<>();
        for (String i : listA) {
            if (i.length()==3){
                listB.add(i);
            }
        }

        //遍历listB集合
        for (String s : listB) {
            System.out.println(s);
        }
    }
}
