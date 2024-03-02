package designPattern.singletonPattern;

public class impMethod {

    private static impMethod instance;

    private impMethod() {
    }

    //懒汉式，线程不安全
//    public static impMethod getInstance() {
//        if (instance == null) {
//            instance = new impMethod();
//        }
//        return instance;
//    }
//

    //    懒汉式，线程安全
//    public static synchronized impMethod getInstance() {
//        if (instance == null) {
//            instance = new impMethod();
//        }
//        return instance;
//    }

    //    饿汉式 ，线程安全
    public static impMethod getInstance() {
        return instance;
    }
}
