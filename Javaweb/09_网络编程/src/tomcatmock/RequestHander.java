package tomcatmock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class RequestHander implements Runnable{
	private Socket socket;

	public  RequestHander(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
			//读取客户端发送过来的信息
			BufferedReader buffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String info = null;
			while((info = buffer.readLine()) != null){
				if("".equals(info))
				{
					break;
				}
				System.out.println(info);
			}
			socket.shutdownInput();
			//返回信息
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			pw.println("HTTP/1.1 200 OK");
			pw.println("Content-Type:text/html;charset=utf-8");
			pw.println();
			pw.print("<html><head></head><body>扑街</body></html>");
			//刷新
			pw.flush();

			socket.shutdownOutput();
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

	
