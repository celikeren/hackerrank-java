package solutions;

import java.util.Scanner;

public class Hack1 {

	public static void main(String[] args) {
		hack1();
	}

	private static void hack1() {
		/*
		 * Java 1D Array (Part 2)
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("How many games? (q)");
		int q = scan.nextInt();
		while (q-- > 0) {
			System.out.println("Number of elements in the array? (n)");
			int n = scan.nextInt();
			System.out.println("What is leap?");
			int leap = scan.nextInt();

			int[] game = new int[n];
			System.out.println("Array: (game)");
			for (int i = 0; i < n; i++) {
				game[i] = scan.nextInt();
			}
			System.out.println((canWin(leap, game)) ? "YES" : "NO");
		}
		scan.close();
	}

	public static boolean canWin(int leap, int[] game) {
		return isSolvable(leap, game, 0);
	}

	private static boolean isSolvable(int leap, int[] game, int i) {
		if (i >= game.length) {
			return true;
		}
		if (i < 0 || game[i] == 1) {
			return false;
		}
		game[i] = 1;
		return isSolvable(leap, game, i + leap) || isSolvable(leap, game, i + 1) || isSolvable(leap, game, i - 1);
	}

}
