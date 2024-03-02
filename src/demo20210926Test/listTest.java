package demo20210926Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listTest {
    public static void main(String[] args) {
        String[] str = {"a", "b", "c"};
        List<String> list = Arrays.asList(str);
        // 可以进行修改
        list.set(1, "e");
        System.out.println(list); // [a, e, c]
//        list.add("a");//运行报错     java.lang.UnsupportedOperationException
//        System.out.println(list);
        String a = "P01237邢(P01237)";

        String b = a.substring(6,a.length()-8);
        System.out.println(b);

    }

}
