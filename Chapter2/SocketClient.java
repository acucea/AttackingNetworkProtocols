// SocketClient.java – A simple Java TCP socket client
//java –DsocksProxyHost=localhost –DsocksProxyPort=1080 SocketClient

import java.io.PrintWriter;
import java.net.Socket;

public class SocketClient {
 public static void main(String[] args) {
 try {
 Socket s = new Socket("192.168.10.1", 5555);
 PrintWriter out = new PrintWriter(s.getOutputStream(), true);
 out.println("Hello World!");
 s.close();
 } catch(Exception e) {
 }
 }
}
