package lambda.demo03LambdaTest;

import java.util.Arrays;
import java.util.Comparator;

public class Demo02Comparator {
    public static Comparator<String> getComparator(){
        //方法的返回值类型是一个接口，那么我们可以返回这个接口的匿名内部类
//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                //按照字符串的降序排序
//                return o2.length()-o1.length();
//            }
//        };

        //方法的返回值类型是一个函数式接口，所以可以返回一个lambda表达式
        return (o1, o2) -> o2.length()-o1.length();
    }

    public static void main(String[] args) {
        String[] arr = {"aaa","b","ccccc","dddddddddddd"};
        System.out.println(Arrays.toString(arr));//[aaa, b, ccccc, dddddddddddd]排序前
        Arrays.sort(arr,getComparator());
        System.out.println(Arrays.toString(arr));//[dddddddddddd, ccccc, aaa, b]排序后
    }
}
