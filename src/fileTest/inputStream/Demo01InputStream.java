package fileTest.inputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        //读取单个字节文件
        FileInputStream fis = new FileInputStream("D:\\normalTest\\JavaAllTest\\a.txt");
//        int len = fis.read();
//        System.out.println(len);
//        len = fis.read();
//        System.out.println(len);
/*
        发现以上读取文件都是重复的代码，所以使用循环优化
        不知道多少字节，使用while循环、
        while 循环条件结束，字节为-1
 */
        int len = 0;
        while ((len = fis.read()) != -1) {

            System.out.print((char) len);
        }
        fis.close();
    }
}
