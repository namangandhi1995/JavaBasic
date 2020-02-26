package com.newgen.test;

public class Rotate {
	static int N = 6;

	// Function to rotate the matrix 90 degree clockwise
	static void rotate90Clockwise(int a[][]) {

		int M = 4;
		int x = 1;
		int y = 1;

		// Traverse each cycle
		for (int i = 0; i < M / 2; i++) {
			for (int j = i; j < M - i - 1; j++) {

				// Swap elements of each cycle
				// in clockwise direction
				int temp = a[i + x][j + y];
				a[i + x][j + y] = a[M + x - 1 - j][i + x];
				a[M + y - 1 - j][i + x] = a[M + x - 1 - i][M + y - 1 - j];
				a[M + x - 1 - i][M + y - 1 - j] = a[j][M + x - 1 - i];
				a[j + y][M + x - 1 - i] = temp;
			}
		}
		/* for (int i = 0; i < M / 2; i++) {
			for (int j = i; j < M - i - 1; j++) {
		  
		            // Swap elements of each cycle 
		            // in clockwise direction 
		            int temp = a[i][j];
					a[i][j] = a[M - 1 - j][i];
					a[M - 1 - j][i] = a[M - 1 - i][M - 1 - j];
					a[M- 1 - i][M - 1 - j] = a[j][M - 1 - i];
					a[j][M - 1 - i] = temp;
		        } 
		    } */
	}

	// Function for print matrix
	static void printMatrix(int arr[][]) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}

	// Driver code

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 },
				{ 19, 20, 21, 22, 23, 24 }, { 25, 26, 27, 28, 29, 30 }, { 31, 32, 33, 34, 35, 36 } };
		rotate90Clockwise(arr);
		printMatrix(arr);
	}

}
