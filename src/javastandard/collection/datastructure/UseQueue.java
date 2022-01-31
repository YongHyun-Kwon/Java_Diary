package javastandard.collection.datastructure;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

/**
 * Queue의 사용 예 : 최근 사용문서, 인쇄작업 대기목록, 버퍼(Buffer)
 *
 * @author 82109
 */
public class UseQueue {

	static Queue<String> q = new LinkedList<String>();
	static final int MAX_SIZE = 5;

	public UseQueue() {
	} // UseQueue

	public static void save(String input) {
		// Queue에 저장
		if (!"".equals(input))
			q.offer(input);

		// queue의 MAX_SIZE를 넘으면 처음 입력된 것을 삭제
		if (q.size() > MAX_SIZE)
			q.remove();
	} // save

	public static void main(String[] args) {

		new UseQueue();

		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

		while (true) {
			System.out.print(">");
			try {
				// 화면으로부터 라인단위로 입력받는다.
				Scanner sc = new Scanner(System.in);
				String input = sc.nextLine().trim();

				if ("".equals(input))
					continue;

				if (input.equalsIgnoreCase("q")) {
					System.exit(0);
				} else if (input.equalsIgnoreCase("help")) {
					System.out.println(" help - 도움말 출력");
					System.out.println(" q or Q- 시스템 종료");
					System.out.println(" history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 출력");
				} else if (input.equalsIgnoreCase("history")) {
					int i = 0;
					// 입력받은 명령어를 저장
					save(input);

					// Linked List 내용 출력
					LinkedList<String> tmp = (LinkedList<String>) q;
					ListIterator<String> it = tmp.listIterator();

					while (it.hasNext())
						System.out.println(++i + "." + it.next());
				} else {
					save(input);
					System.out.println(input);
				} // end else
			} catch (Exception e) {
				System.out.println("입력 오류");
			} // end catch

		} // end while
		
	} // main

}
// class
