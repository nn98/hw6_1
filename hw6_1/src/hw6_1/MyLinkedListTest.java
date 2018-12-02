/*
 * hw6_1
 * 김윤서
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
		System.out.println("hw6_1: 김윤서\n");
		do {
			System.out.println("1:전체조회 2:길이조회 3:맨앞삽입 4:맨뒤삽입 5:맨앞삭제 6:맨뒤삭제 7:종료");
			c=s.nextInt();
			switch(c) {
			case 1:
				System.out.println(list.toString());
				break;
			case 2:
				System.out.println(list.size());
				break;
			case 3:
				System.out.println("맨 앞에 삽입할 정수 입력:");
				int i=s.nextInt();
				list.addFirst(i);
				break;
			case 4:
				System.out.println("맨 뒤에 삽입할 정수 입력:");
				int i1=s.nextInt();
				list.addLast(i1);
				break;
			case 5:
				try {
				System.out.println("맨 앞의 정수 :"+list.removeFirst());
				}
				catch (NullPointerException e) {
					System.out.println("맨 앞에 정수가 존재하지 않습니다.");
				}
				break;
			case 6:
				try {
				System.out.println("맨 뒤의 정수 :"+list.removeLast());
				}
				catch (NullPointerException e) {
					System.out.println("맨 뒤에 정수가 존재하지 않습니다.");
				}
				break;
			default:
			}
		}while(c!=7);

	}

}
