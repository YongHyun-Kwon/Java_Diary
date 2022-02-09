package javastandard.network;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

/**
 * 설정한 ip주소와 포트를 가지고 서버를 찾아 연결하는 일. -> client
 * 
 * @author user
 */
public class SimpleClient {

	public SimpleClient() throws UnknownHostException, IOException {
		// 2. 소켓을 생성하여 서버에 연결 시도
		Socket client = null;
		DataInputStream dis = null;
		try {
			String ip = JOptionPane.showInputDialog("아이피를 넣어 주세요");
			client = new Socket("211.xx.xx."+ip, 65500);
			System.out.println("서버에접속 시도하여 접속성공");
			// 4. 서버에서 보내오는 메시지를 읽기위해 스트림을 연결
			dis = new DataInputStream(client.getInputStream());
			// 5. 메세지를 decoding 하여 읽어온다.
			String revMsg = dis.readUTF();
			System.out.println("서버에서 온 메시지 :" + revMsg);
		} finally {
			if (dis != null) {
				dis.close();
			} // end if
			if (client != null) {
				client.close();
			} // end if
		} // end finally
	} // SimpleClient

	public static void main(String[] args) {

		try {
			new SimpleClient();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	} // main

} // class
