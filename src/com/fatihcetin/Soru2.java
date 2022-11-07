package com.fatihcetin;

import java.util.ArrayList;
import java.util.Iterator;

public class Soru2 {

	public static void main(String[] args) {

		int sayiDizisi[] = { 9, 7, 5, 3, 7, 7, 3, 18, 2, 0, 7 };

		int[] checkList = new int[sayiDizisi.length];
		int checkIndex = 0;

		for (int i = 0; i < sayiDizisi.length; i++) {
			int total = 1;

			if (!checkValueIsExist(checkList, sayiDizisi[i])) {

				for (int j = 0; j < sayiDizisi.length; j++) {

					if (i != j && sayiDizisi[i] == sayiDizisi[j]) {
						total++;
					}
				}
				checkList[checkIndex] = sayiDizisi[i];
				checkIndex++;
				System.out.println(sayiDizisi[i] + " için tekrar eden sayı : " + total);
			}
		}

	}

	static boolean checkValueIsExist(int[] array, int number) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				return true;
			}
		}
		return false;

	}
}
