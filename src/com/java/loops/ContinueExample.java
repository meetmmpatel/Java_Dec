package com.java.loops;

public class ContinueExample {

	public static void main(String[] args) {
		for (int i = 0; i <= 6; i++) {

			if (i == 3) {
				System.out.println("its number three");
				continue;

			}

			System.out.println(i);
		}

		int counter = 10;
		while (counter >= 0) {
			if (counter == 7) {
				counter--;
				continue;
			}
			System.out.print(counter + " ");
			counter--;
		}

	}

}
