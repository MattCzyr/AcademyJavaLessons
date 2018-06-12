package solutions.friday;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		int[][] data1 = new int[3][4];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				data1[i][j] = rand.nextInt(10);
			}
		}
		
		int[][] data2 = new int[4][3];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				data2[i][j] = rand.nextInt(10);
			}
		}
		
		Matrix m1 = new Matrix(data1);
		Matrix m2 = new Matrix(data2);
		
		System.out.println("MATRIX 1:");
		m1.print();
		System.out.print("\n");
		
		System.out.println("MATRIX 2:");
		m2.print();
		System.out.print("\n");
		
		Matrix m3 = m1.multiply(m2);
		System.out.println("RESULT MATRIX:");
		m3.print();
	}
	
}
