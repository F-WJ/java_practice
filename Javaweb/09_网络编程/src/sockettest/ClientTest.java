package sockettest;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTest {

	public static void main(String[] args) throws Exception {
		//1.创建socket对象
		Socket socket = new Socket("127.0.0.1", 8888);
		//2.往服务端发送数据
		OutputStream out = socket.getOutputStream();
		//3.发送数据传送完毕信息
		out.write("在吗, 傻b".getBytes());
		socket.shutdownOutput();
		//4.接收服务端返回的信息
		InputStream in = socket.getInputStream();
		byte[] buffer = new byte[1024];
		int len = 0;
		while((len = in.read(buffer)) > 0){
			String str = new String(buffer, 0, len);
			System.out.println(str);
		}
		socket.shutdownInput();
		//5.关闭连接
		socket.close();

	}

}
