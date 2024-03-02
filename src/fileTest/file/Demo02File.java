package fileTest.file;

import java.io.File;

public class Demo02File {
    public static void main(String[] args) {
        show01();
    }

    private static void show01() {
        File file = new File("D:\\学习资料\\a.txt");
        String absolutePath1 = file.getAbsolutePath();
        System.out.println("绝对路径 = "+ absolutePath1);
        
        File file1 = new File("a.txt");
        String absolutePath2 = file1.getAbsolutePath();
        System.out.println(absolutePath2);

    }
}
