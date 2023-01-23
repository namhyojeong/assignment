package com.greedy.Smoothiezzang;

public class menuChoice extends coffeeMenu {

	String ame;
	String la;
	String smoo;
	
	public void makeCoffee(int no) {
		switch(no) {
			case 1 :
				americano ame = new americano();
				ame.makeAmericano();
				
				break;
			case 2:
				latte la = new latte();
				la.makeLatte();
				break;
			case 3 :
				smoothie smoo = new smoothie();
				smoo.makeSmoothie();
				break;
		}
	
	
	}
}
