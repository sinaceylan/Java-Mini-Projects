package com.sinaceylan.matematik;

public class Matematik implements IMatematik {

	@Override
	public void toplama(int a, int b) {
		System.out.println("Toplama Sonucu: "+(a+b));
		
	}

	@Override
	public void cikarma(int a, int b) {
		System.out.println("��karma Sonucu: "+(a-b));
		
	}

	@Override
	public void carpma(int a, int b) {
		System.out.println("�arpma Sonucu: "+(a*b));
		
	}

	@Override
	public void bolme(int a, int b) {
		System.out.println("B�lme Sonucu: "+((double)a/b));
		
	}
	
	
	
	
}
