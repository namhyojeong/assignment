package com.greedy.Smoothiezzang;

public class smoothie extends coffeeMenu {
	
	final int SMOOTHIEPRICE = 5000;
	
	public void makeSmoothie() {
		if(TotalPrice.totalPrice >= 50000) {
			System.out.println("스무디를 만들어서 팔았습니다. 이제 모든 메뉴를 만들 수 있게 되었습니다!!");
			
			TotalPrice.totalPrice += SMOOTHIEPRICE;
		
		} else {
			System.out.println("총 매출액이 50000원을 넘지 못해 스무디를 만드는 방법을 배우지 못했습니다.");
		}
	}
	
	
}