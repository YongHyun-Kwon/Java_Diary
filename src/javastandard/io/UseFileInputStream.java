package javastandard.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * FileInputStream�� ����� ������ ���� �б�
 * 
 * @author user
 */
public class UseFileInputStream {

	public UseFileInputStream() throws IOException {
		// 1. ���Ͽ� ��Ʈ���� ����
		File file = new File("e:/dev/temp/java_read.txt");
		if (file.exists()) {
			FileInputStream fis = null;

			try {
				fis = new FileInputStream(file); // 1.���Ͽ� ��Ʈ���� ����� ����
				// ����� ���Ͽ��� ���� 1byte�� �о���δ�.
//				int data = fis.read(); // 2. ����� ��Ʈ������ 1byte�� �����´�.
//				System.out.println("�о���� ������ : " + (char) data);

				// ����� ���Ͽ��� ��� �����͸� 1byte�� �о���δ�.
				int data = 0;
				while ((data = fis.read()) != -1) { // EOF
					System.out.print((char)data);
				}

			} finally {
				if (fis != null)
					fis.close(); // 3. ��Ʈ���� ����� �����ٸ� �޸� ������ �������� �ݵ�� ������Ѵ�.
			} // end finally

		} else {
			System.out.println(file.getAbsolutePath() + "�� �������� �ʽ��ϴ�.");
		} // end else

	} // UseFileInputStream

	public static void main(String[] args) {

		try {
			new UseFileInputStream();
		} catch (IOException e) {
			// �������� �����࿡�� �߻��� IOException�� �ѹ��� ��Ƽ� ó���� �� �ִ�.
			e.printStackTrace();
		} // end catch

	} // main

} // class
