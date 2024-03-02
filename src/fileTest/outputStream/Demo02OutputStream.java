package fileTest.outputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//一次写入多个字符
public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("D:\\normalTest\\JavaAllTest\\b.txt"));//文件路径 创建对象
        fos.write(49);
        fos.write(48);
        fos.write(48);
//        byte[] bytes = {65,66,67,68,69};
        byte[] bytes = {-65, -66, -67, 68, 69};

        fos.write(bytes);
        fos.close();
    }
}
