package com.fatihcetin;

import java.util.Scanner;

public class Soru4 {
	
	//	Geometrik hesaplamalaryapanprogramı yazınız. Program aşağıdaki gibi bir menüsü olacakve aşağıdaki işlevleri yapacaktır:
	
	private static Scanner scanner = new Scanner(System.in);

	
	static void printWelcomeText() {
		System.out.println("* * * * * * * * * * ** * * *  * * * *");
		System.out.println("* 	  Geometrik Hesaplayıcı     *");
		System.out.println("* * * * * * * * * * ** * * *  * * * *");
		System.out.println("1. Kare alan hesaplama");
		System.out.println("2. Kare çevre hesaplama");
		System.out.println("3. Dikdörtgen alan hesaplama");
		System.out.println("4. Dikdörtgen çevre hesaplama");
		System.out.println("5. Daire alan hesaplama ");
		System.out.println("6. Daire Çevre hesaplama");
		System.out.println("7. Çıkış");
		System.out.println("Lütfen Hesaplamak İstediniz Operasyonun Kodunu Giriniz..");
	}
	
	static void calculateSquare() {
		System.out.println("Lütfen karenin bir kenarının uzunluğunu giriniz");
		double squareEdge = scanner.nextDouble();
		squareEdge = squareEdge * squareEdge;
		System.out.println(squareEdge);		
	}
	static void calculatePrimeterofSquare() {
		System.out.println("Lütfen Çevresini Hesaplamak İstediğiniz karenin kenar uzunluğunu giriniz");
		double squareEdge1 = scanner.nextDouble();
		squareEdge1 = squareEdge1 * 4;
		System.out.println(squareEdge1);
			
	}
	
	static void rectangularArea() {
		System.out.println("Lütfen Alanını Hesaplamak İstediğiniz Dikdörtgenin kenar uzunluğuklarını giriniz");
		
		System.out.println("Lütfen Alanını Hesaplamak İstediğiniz Dikdörtgenin kısa kenar uzunluğunu giriniz");
		double rectangularShortSide = scanner.nextDouble();
		System.out.println("Lütfen Alanını Hesaplamak İstediğiniz Dikdörtgenin uzun3 kenar uzunluğunu giriniz");
		double rectangularLongSide = scanner.nextDouble();
		double square = 0;
		square = rectangularShortSide * rectangularLongSide;
		System.out.println(square);
		
	}
	static void rectangulerPrimeter() {
		System.out.println("Lütfen Çevresini Hesaplamak İstediğiniz Dikdörtgenin kısa kenar uzunluğunu giriniz");
		double rectangularShortSide1 = scanner.nextDouble();
		System.out.println("Lütfen Çevresini Hesaplamak İstediğiniz Dikdörtgenin uzun3 kenar uzunluğunu giriniz");
		double rectangularLongSide1 = scanner.nextDouble();
		double circumference = 0;
		circumference = 2 * rectangularShortSide1 + 2 * rectangularLongSide1;
		System.out.println(circumference);
		
	}
	
	static void circleArea() {
		System.out.println("Lütfen Alanını Hesaplamak İstediğiniz Dairenin Yarı Çapını Giriniz..");
		double radius = scanner.nextDouble();
		double cirleSquare = Math.PI * (radius * radius);
		System.out.println("Dairenin Alanı: " + cirleSquare);

	}
	static void circlePrimeter() {
		System.out.println("Lütfen Çevresini Hesaplamak İstediğiniz Dairenin Yarı Çapını Giriniz..");
		double radius1 = scanner.nextDouble();
		double circleCircumference =2 * Math.PI * radius1 ;
		System.out.println("Dairenin Çevresi: " + circleCircumference);
	}
	static void exitProgram() {
		System.out.println("Hesaplama Programından Çıkış Yapılıyor");
	}
	static void warningText() {
		System.out.println("Lütfen 1 ile 7 Arasında Bir Sayı Giriniz");
	}
	
	static boolean runProgram() {
		
		printWelcomeText();
		
		
		int operation = scanner.nextInt();
		
		double a,b;
		
		
		
		switch (operation) {
		case 1:
			calculateSquare();
			return true;
		case 2:
			calculatePrimeterofSquare();
			return true;
		case 3:
			rectangularArea();
			return true;
		case 4:
			rectangulerPrimeter();
			return true;
		case 5:
			circleArea();
			return true;
		case 6:
			circlePrimeter();
			return true;
		case 7:
			exitProgram();
			return false;
		default:
			warningText();
			return true;
		}
		
	}
	

	public static void main(String[] args) {
		
		boolean programStatus = true; 		
		
		while(programStatus){
			programStatus = runProgram();
		}

		
	}

}
