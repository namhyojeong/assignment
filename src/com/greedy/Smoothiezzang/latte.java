package com.greedy.Smoothiezzang;

public class latte extends coffeeMenu {

	final int LATTEPRICE = 4000;
	
	public void makeLatte() {
		if(TotalPrice.totalPrice >= 10000) {
			System.out.println("라떼를 만들어서 팔았습니다.");
			
			TotalPrice.totalPrice += LATTEPRICE;
		
		} else {
			System.out.println("총 매출액이 10000원을 넘지 못해 라떼 만드는 방법을 배우지 못했습니다.");
		}
	}
	
}