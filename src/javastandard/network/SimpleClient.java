package javastandard.network;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

/**
 * ������ ip�ּҿ� ��Ʈ�� ������ ������ ã�� �����ϴ� ��. -> client
 * 
 * @author user
 */
public class SimpleClient {

	public SimpleClient() throws UnknownHostException, IOException {
		// 2. ������ �����Ͽ� ������ ���� �õ�
		Socket client = null;
		DataInputStream dis = null;
		try {
			String ip = JOptionPane.showInputDialog("�����Ǹ� �־� �ּ���");
			client = new Socket("211.xx.xx."+ip, 65500);
			System.out.println("���������� �õ��Ͽ� ���Ӽ���");
			// 4. �������� �������� �޽����� �б����� ��Ʈ���� ����
			dis = new DataInputStream(client.getInputStream());
			// 5. �޼����� decoding �Ͽ� �о�´�.
			String revMsg = dis.readUTF();
			System.out.println("�������� �� �޽��� :" + revMsg);
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
