package fileTest.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo01Writer {
    public static void main(String[] args) throws IOException {
        File file;
        FileWriter fw = new FileWriter("D:\\normalTest\\JavaAllTest\\d.txt");
        fw.write(97);
//        fw.flush();
        fw.close();

    }
}
