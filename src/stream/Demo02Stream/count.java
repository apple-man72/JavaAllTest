package stream.Demo02Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class count {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        long count = list.stream().count();
        System.out.println(count);
    }
}
