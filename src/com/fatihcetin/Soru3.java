package com.fatihcetin;

import java.util.Scanner;

public class Soru3 {

	
	static void karakterSayici(String words, char ch ) {
		

		char[] nameCharArray = words.toLowerCase().toCharArray();

		int toplam = 0;

		for (int i = 0; i < nameCharArray.length; i++) {
			if (ch == nameCharArray[i])
				toplam++;

		}

		System.out.println(ch + " sayısı " + toplam);
	}
	
	public static void main(String[] args) {
		System.out.println("Lütfen aranılacak kelimeyi giriniz...");
		Scanner scanner = new Scanner(System.in);
		
	    String word = scanner.nextLine();

	
		System.out.println("Lütfen aranılacak harfi giriniz...");
		char letter = scanner.nextLine().charAt(0);

		karakterSayici(word,letter);

	}

}
