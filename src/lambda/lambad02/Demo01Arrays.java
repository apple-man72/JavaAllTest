package lambda.lambad02;

import java.util.Arrays;
import java.util.Comparator;

public class Demo01Arrays {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("刘艳", 38),
                new Person("迪丽热巴", 19),
                new Person("古力娜扎", 20)

        };
//        Arrays.sort(arr, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });

//        使用lanbda表达式，简化匿名内部类
        Arrays.sort(arr, (Person o1, Person o2) -> {
            return o1.getAge() - o2.getAge();
        });

        for (Person person : arr) {
            System.out.println(person);
        }
    }
}
