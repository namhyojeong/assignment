package com.greedy.Smoothiezzang;

import java.util.Scanner;

public class Smoothiezzang {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		coffeeMenu coffeemenu = new coffeeMenu();
		TotalPrice total = new TotalPrice();
		
		while(true) {
			System.out.println("===== 스무디까지 만들기 게임 스타트 =====");
			System.out.println("1.직원정보\t 2.메뉴판\t 3.매출액\n0.게임종료");
			System.out.println("메뉴 선택");
			int no = sc.nextInt();
			switch(no) {
				case 1 :
					employee.employeeInformation();
					break;
				case 2 :
					coffeemenu.coffeeMenupan();
					break;
				case 3 :
					total.checkTotalPrice();
					break;
				case 0 :
					System.out.println("게임을 종료합니다.");
					return;
				default :
					System.out.println("잘못된 번호를 입력하셨습니다.");
					break;
					
					
				
			}
		}
	}

}
