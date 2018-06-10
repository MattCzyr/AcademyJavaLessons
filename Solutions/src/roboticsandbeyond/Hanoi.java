package roboticsandbeyond;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Hanoi {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Queue<Integer> sourcePeg = new PriorityQueue<Integer>();
		Queue<Integer> sparePeg = new PriorityQueue<Integer>();
		Queue<Integer> targetPeg = new PriorityQueue<Integer>();
		
		System.out.println("How many disks?");
		int disks = scan.nextInt();
		for (int i = 1; i <= disks; i++) {
			sourcePeg.add(i);
		}
		
		solve(sourcePeg, sparePeg, targetPeg, disks);
		
		scan.close();
	}
	
	public static void solve(Queue<Integer> sourcePeg, Queue<Integer> sparePeg, Queue<Integer> targetPeg, int n) {
		if (n == 0) {
			
		} else {
			solve(sourcePeg)
		}
	}
	
	public static void printPegs(Queue<Integer> sourcePeg, Queue<Integer> sparePeg, Queue<Integer> targetPeg, int n) {
		System.out.print("SOURCE: ");
		for (int i = 0; i < sourcePeg.)
		
		int sourceSize = (sourcePeg.size() * 2) - 1 > 6 ? (sourcePeg.size() * 2) - 1 : 6;
		int spareSize = (sparePeg.size() * 2) - 1 > 5 ? (sparePeg.size() * 2) - 1 : 5;
		int targetSize = (targetPeg.size() * 2) - 1 > 6 ? (targetPeg.size() * 2) - 1 : 6;
		
		for (int i = 0; i < n; i++) {
			// Source
			int sourceWhitespace = (sourceSize - ((i * 2) - 1)) / 2;
			for (int j = 0; j < sourceWhitespace; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 - 1; j++) {
				System.out.print("#");
			}
			for (int j = 0; j < sourceWhitespace; j++) {
				System.out.print(" ");
			}
			
			// Spare
			int spareWhitespace = (spareSize - ((i * 2) - 1)) / 2;
			for (int j = 0; j < spareWhitespace; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 - 1; j++) {
				
			}
		}
		System.out.print("SOURCE");
		for (int i = 0; i < sourceSize - 6; i++) {
			System.out.print(" ");
		}
		System.out.print("SPARE");
		for (int i = 0; i < spareSize - 5; i++) {
			System.out.print(" ");
		}
		System.out.println("TARGET\n");
	}

}
