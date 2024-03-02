package normalTest.demo20211119;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class TestField {
    public static void main(String[] args) throws Exception{
        Class<Person> personClass = Person.class;        //获取所有的成员变量，包含私有的

        Field[] allFields = personClass.getDeclaredFields();        //获取所有公有的成员变量，包含父类的

        Field[] publicFields = personClass.getFields();

        System.out.println("所有的成员变量：");
        for(Field f : allFields){
            System.out.println(f);
        }
        //获取某个变量的值
        //创建对象的实例
        Constructor<Person> c = personClass.getDeclaredConstructor(String.class);
        c.setAccessible(true); //因为该构造函数时私有的，需要在这里设置成可访问的
        Person person = c.newInstance("刘俊重");
        //获取变量name对象
        Field field = personClass.getDeclaredField("name");
        field.setAccessible(true); //因为变量name是私有的，需要在这里设置成可访问的
        //注意对比下面这两行，官方对field.get(Object obj)方法的解释是返回对象obj字段field的值
        Object value = field.get(person);
        //String name = person.getName();
        System.out.println("获取的变量的值是："+value);

    }
}
