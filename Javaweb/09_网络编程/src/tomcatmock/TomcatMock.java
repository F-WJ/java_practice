package tomcatmock;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TomcatMock {
	public static void main(String[] args) throws Exception {
		//建服务端
		ServerSocket ss = new ServerSocket(8888);
		while(true){
			//监听客户端
			Socket socket = ss.accept();
			//启动线程
			new Thread(new RequestHander(socket)).start();
		}
	}
}
