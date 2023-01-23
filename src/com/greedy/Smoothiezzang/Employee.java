package com.greedy.Smoothiezzang;

import java.util.Scanner;

public class Employee {
	
	public void employeeInformation() {

		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		System.out.println("이름을 입력해주세요.");
		String name = sc.nextLine();
		System.out.println("나이를 입력해주세요.");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("성별을 입력해주세요.");
		char gender = sc.nextLine().charAt(0);
	}
}
