package com.fatihcetin;

public class Soru1 {

	private static void star() {

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= 6; j++) {
				System.out.print(" * ");
			}

			System.out.println();
		}
		for (int x = 0; x <= 5; x++) {
			for (int y = 0; y <= 5 - x; y++) {
				System.out.print(" * ");

			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		star();

	}

}
