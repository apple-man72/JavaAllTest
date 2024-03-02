package fileTest.outputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//写入单个字符
public class Demo01OutputStream {
    public static void main(String[] args) throws IOException {
     File file;
     FileOutputStream fos = new FileOutputStream("D:\\normalTest\\JavaAllTest\\a.txt");
     fos.write(20013);
     fos.close();
    }
}
