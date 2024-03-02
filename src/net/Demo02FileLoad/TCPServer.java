package net.Demo02FileLoad;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
        文件上传案例的服务器端：读取客户端上传的文件，保存到服务器硬盘，给客户的回写“上传成功”
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket sc = new ServerSocket(8888);
        Socket socket = sc.accept();
        InputStream is = socket.getInputStream();
        File file = new File("d:\\文件111111111111111111");
        if (!file.exists()) {
            file.mkdirs();
        }
        FileOutputStream fos = new FileOutputStream(file + "\\1.jpg",true);
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = is.read(bytes)) != -1) {
            fos.write(bytes,0,len);
        }
        socket.getOutputStream().write("上传成功！".getBytes());
        fos.close();
        socket.close();
        sc.close();

    }
}
