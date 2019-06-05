package sockettest;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {
	public static void main(String[] args) throws Exception {
		//建立服务端
		ServerSocket ss = new ServerSocket(8888);
		//监听客户端
		Socket socket = ss.accept();
		//读取客户端发送信息
		InputStream in = socket.getInputStream();
		byte[] buffer = new byte[1024];
		int len = 0;
		while((len = in.read(buffer)) > 0){
			String str = new String(buffer, 0, len);
			System.out.println(str);
		}
		socket.shutdownInput();
		//发送反馈信息
		OutputStream out = socket.getOutputStream();
		out.write("收到了, 扑街".getBytes());
		socket.shutdownOutput();
		//关闭
		socket.close();
		
	}
}
