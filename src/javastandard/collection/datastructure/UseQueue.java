package javastandard.collection.datastructure;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

/**
 * Queue�� ��� �� : �ֱ� ��빮��, �μ��۾� �����, ����(Buffer)
 *
 * @author 82109
 */
public class UseQueue {

	static Queue<String> q = new LinkedList<String>();
	static final int MAX_SIZE = 5;

	public UseQueue() {
	} // UseQueue

	public static void save(String input) {
		// Queue�� ����
		if (!"".equals(input))
			q.offer(input);

		// queue�� MAX_SIZE�� ������ ó�� �Էµ� ���� ����
		if (q.size() > MAX_SIZE)
			q.remove();
	} // save

	public static void main(String[] args) {

		new UseQueue();

		System.out.println("help�� �Է��ϸ� ������ �� �� �ֽ��ϴ�.");

		while (true) {
			System.out.print(">");
			try {
				// ȭ�����κ��� ���δ����� �Է¹޴´�.
				Scanner sc = new Scanner(System.in);
				String input = sc.nextLine().trim();

				if ("".equals(input))
					continue;

				if (input.equalsIgnoreCase("q")) {
					System.exit(0);
				} else if (input.equalsIgnoreCase("help")) {
					System.out.println(" help - ���� ���");
					System.out.println(" q or Q- �ý��� ����");
					System.out.println(" history - �ֱٿ� �Է��� ��ɾ " + MAX_SIZE + "�� ���");
				} else if (input.equalsIgnoreCase("history")) {
					int i = 0;
					// �Է¹��� ��ɾ ����
					save(input);

					// Linked List ���� ���
					LinkedList<String> tmp = (LinkedList<String>) q;
					ListIterator<String> it = tmp.listIterator();

					while (it.hasNext())
						System.out.println(++i + "." + it.next());
				} else {
					save(input);
					System.out.println(input);
				} // end else
			} catch (Exception e) {
				System.out.println("�Է� ����");
			} // end catch

		} // end while
		
	} // main

}
// class
