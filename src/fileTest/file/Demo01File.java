package fileTest.file;

import java.io.File;

public class Demo01File {
    public static void main(String[] args) {
//        String separator = File.pathSeparator;
//        System.out.println(separator);
//        show02("D:\\学习资料", "a.txt");
//        show02("C:\\学习资料", "a.txt");
        show03();

    }

    private static void show03() {
        File parent = new File("c:\\");
        File file = new File(parent,"hello.java" );
        System.out.println(file);
    }

    private static void show02(String parent, String child) {
        File file = new File(parent, child);
        System.out.println(file);


    }

    private static void show01() {
        File f1 = new File("D:\\学习资料\\a.txt");
        System.out.println(f1);

        File f2 = new File("D:\\学习资料\\sy.txt");
        System.out.println(f2);

        File f3 = new File("b.txt");
        System.out.println(f3);
    }
}
