package stream.Demo02Stream;

import java.util.stream.Stream;

public class Stream_Foreach {
    public static void main(String[] args) {
        //获取一个Stream流
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六", "田七");
        //使用foreach遍历
        stream.forEach((name)-> System.out.println(name));
    }
}
