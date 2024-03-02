package fileTest.outputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("D:\\normalTest\\JavaAllTest\\c.txt"));//文件路径 创建对象
        for (int i = 0; i < 10; i++) {
            fos.write("你好".getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();

    }
}
