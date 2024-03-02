package fileTest.reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo02Reader {
    public static void main(String[] args) throws IOException {
        //使用reader读取文件内容
        FileReader fileReader = new FileReader("D:\\normalTest\\JavaAllTest\\c.txt");
//        int len = 0;
//        while ((len = fileReader.read())!=-1){
//            System.out.print((char) len);
//        }
        char[] cs = new char[1024];
        int len = 0;
        while ((len = fileReader.read(cs)) != -1) {
            System.out.println(new String(cs, 0, len));
        }

        fileReader.close();
    }
}
