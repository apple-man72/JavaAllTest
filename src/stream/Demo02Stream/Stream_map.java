package stream.Demo02Stream;

import java.util.stream.Stream;

public class Stream_map {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("1", "2", "3", "4");
        Stream<Integer> stream2 = stream1.map(s -> Integer.parseInt(s));
        stream2.forEach((a)-> System.out.println(a));
    }
}
