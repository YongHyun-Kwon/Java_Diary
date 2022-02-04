package javastandard.io;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 * File 클래스의 사용
 * 
 * @author user
 */
public class UseFile {

	public UseFile() {
		// 1. 파일생성
		File file = new File("e:/dev/temp/java_read.txt");

		System.out.println(file.exists() ? "존재" : "경로확인");
		System.out.println(file.length() + "byte");
		System.out.println(file.isFile() ? "파일" : "디렉토리");
		System.out.println(file.isDirectory() ? "디렉토리" : "파일");
		System.out.println(file.isHidden() ? "숨김파일" : "일반파일");
		System.out.println(file.canRead() ? "읽기가능" : "읽기불가능");
		System.out.println(file.canWrite() ? "쓰기가능" : "쓰기불가능");
		System.out.println(file.canExecute() ? "실행가능" : "실행불가능");
		System.out.println(file.lastModified());
		long lm = file.lastModified();
		Date date = new Date(lm);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-hh:mm:ss");
		System.out.println("마지막으로 수정된 날짜 : " + sdf.format(date));

		System.out.println("파일경로 : " + file.getPath());
		System.out.println("파일절대경로 : " + file.getAbsolutePath());
		try {
			System.out.println("파일규범경로 : " + file.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		} // end catch

		System.out.println("파일을 가진 폴더명 : " + file.getParent());
		System.out.println("폴더명의 파일 : " + file.getParentFile());
		
		// 파일명 변경
		// 1. 변경할 이름을 가진 File 생성
//		File rename = new File(file.getParent()+"/java_read_1.txt" );
//		System.out.println(file.renameTo(rename));
		
		// 파일 삭제
//		System.out.println(file.delete());
		
		// 디렉토리 생성
		//1. 생성할 디렉토리명을 가진 파일을 생성
		File mk = new File("e:/dev1/temp/test");
		System.out.println(mk.mkdir());
		
		
		

	} // UseFile

	public static void main(String[] args) {
		new UseFile();
	} // main

} // class
