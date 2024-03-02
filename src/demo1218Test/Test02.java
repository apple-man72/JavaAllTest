package demo1218Test;

import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("hello");
        list1.add("world");
        list1.add("java");
        Select(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(123);
        list2.add(456);
        list2.add(789);
        Select(list2);

    }

    public static void Select(ArrayList<?> arrayList) {
        for (Object obj : arrayList) {
            System.out.println(obj);
        }

    }

}
