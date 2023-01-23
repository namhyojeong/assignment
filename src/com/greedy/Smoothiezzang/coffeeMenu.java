package com.greedy.Smoothiezzang;

import java.util.Scanner;

public class coffeeMenu {

	final int AMERICANOPRICE = 3000;
	final int LATTEPRICE = 4000;
	final int SMOOTHIEPRICE = 5000;
	public int totalPrice;
	private String americano;
	private String latte;
	private String smoothie;
	Scanner sc = new Scanner(System.in);

	public void coffeeMenupan() {
		
		String americano = "1. 아메리카노";
		System.out.println(americano);
		String latte = "2. 라떼";
		System.out.println(latte);
		String smoothie = "3. 스무디";
		System.out.println(smoothie);
		int no = sc.nextInt();
		if(no > 0 && no < 4) {
		menuChoice choice = new menuChoice();
		choice.makeCoffee(no);
		System.out.println("");
		} else {
			System.out.println("없는 메뉴 입니다.");
		}
	}

	public void makeAmericano() {
	}

	public void makeLatte() {
	}

	public void makeSmoothie() {
	}

}
