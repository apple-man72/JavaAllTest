package fileTest.inputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo02InputStream {
    public static void main(String[] args) throws IOException {
        //读取单个字节文件
        FileInputStream fis = new FileInputStream("D:\\normalTest\\JavaAllTest\\b.txt");
        byte[] bytes = new byte[2];
        int len = fis.read(bytes);
        System.out.println(len);
        System.out.println(Arrays.toString(bytes));
        fis.read();
    }
}
