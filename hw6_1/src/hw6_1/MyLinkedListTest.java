/*
 * hw6_1
 * ������
 * 09/28
 */

package hw6_1;

import java.util.Scanner;

public class MyLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList list=new MyLinkedList();
		int c=0;
		Scanner s=new Scanner(System.in);
		System.out.println("hw6_1: ������\n");
		do {
			System.out.println("1:��ü��ȸ 2:������ȸ 3:�Ǿջ��� 4:�ǵڻ��� 5:�Ǿջ��� 6:�ǵڻ��� 7:����");
			c=s.nextInt();
			switch(c) {
			case 1:
				System.out.println(list.toString());
				break;
			case 2:
				System.out.println(list.size());
				break;
			case 3:
				System.out.println("�� �տ� ������ ���� �Է�:");
				int i=s.nextInt();
				list.addFirst(i);
				break;
			case 4:
				System.out.println("�� �ڿ� ������ ���� �Է�:");
				int i1=s.nextInt();
				list.addLast(i1);
				break;
			case 5:
				try {
				System.out.println("�� ���� ���� :"+list.removeFirst());
				}
				catch (NullPointerException e) {
					System.out.println("�� �տ� ������ �������� �ʽ��ϴ�.");
				}
				break;
			case 6:
				try {
				System.out.println("�� ���� ���� :"+list.removeLast());
				}
				catch (NullPointerException e) {
					System.out.println("�� �ڿ� ������ �������� �ʽ��ϴ�.");
				}
				break;
			default:
			}
		}while(c!=7);

	}

}
