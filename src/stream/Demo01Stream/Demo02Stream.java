package stream.Demo01Stream;

import java.util.ArrayList;
import java.util.List;

public class Demo02Stream {
    public static void main(String[] args) {
        //使用stream流进行遍历
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.stream()
//                .filter(name->name.startsWith("张"))
//                .filter(name->name.length()==3)
                .forEach(name-> System.out.println(name));
//        list.stream().forEach((name)-> System.out.println(name));
    }
}
