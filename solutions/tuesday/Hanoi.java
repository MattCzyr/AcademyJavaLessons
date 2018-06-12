package solutions.tuesday;

import java.util.Scanner;

public class Hanoi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("How many disks?");
		int disks = scan.nextInt();

		solve("SOURCE", "SPARE", "TARGET", disks);

		scan.close();
	}

	public static void solve(String fromRod, String spareRod, String toRod, int n) {
		if (n == 1) {
			System.out.println("Moving disk 1 from " + fromRod + " rod to " + toRod + " rod");
		} else {
			solve(fromRod, toRod, spareRod, n - 1);
			System.out.println("Moving disk " + n + " from " + fromRod + " rod to " + toRod + " rod");
			solve(spareRod, fromRod, toRod, n - 1);
		}
	}

}
