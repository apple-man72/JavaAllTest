package normalTest.demo20211119;
public class Test {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<Test> class1 = Test.class;
        System.out.println("类名1："+class1.getName());

        Test Test = new Test();
        Class<? extends Test> class2 = Test.getClass();
        System.out.println("类名2："+class2.getName());

        Class<?> class3 = Class.forName("normalTest.demo20211119.Test");
        System.out.println("类名3："+class3.getName());
        if(class1==class2){
            System.out.println("class1==class2");
        }
        if(class1==class3){
            System.out.println("class1==class3");
        }
    }
}
