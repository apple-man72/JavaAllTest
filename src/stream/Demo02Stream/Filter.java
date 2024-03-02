package stream.Demo02Stream;

import java.util.stream.Stream;

public class Filter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌");
        Stream<String> stream1 = stream.filter(name -> name.startsWith("张"));
        stream1.forEach(name-> System.out.println(name));

    }
}
