package normalTest.demo20211119;

public class Person {
    private int age;
    private String name;
    public Person() {
    }
    private Person(String name){
        this.name = name;
    }
    public Person(int age,String name){
        this.age = age;
        this.name = name;
    }
    //省略set/get方法
    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
