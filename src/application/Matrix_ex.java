package application;

import java.util.Scanner;

public class Matrix_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter matrix dimensions (lines and columns): ");
		System.out.print("Lines: ");
		int m = sc.nextInt();
		System.out.print("Columns: ");
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				System.out.print("Enter "+i+","+j+" element: ");
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("Enter a matrix element: ");
		int x = sc.nextInt();
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				//System.out.println();
				//System.out.println("Length: "+mat.length);
				if (x==mat[i][j]) {
					System.out.println("Position "+i+","+j+" :"+mat[i][j]);
					if (j>0) {
						System.out.println("Left: "+mat[i][j-1]);
					}
					if (j<mat[i].length-1) {
						System.out.println("Right: "+mat[i][j+1]);
					}
					
					if (i>0) {
						System.out.println("Up: "+mat[i-1][j]);
					}
					
					if (i<mat.length-1) {
						System.out.println("Down: "+mat[i+1][j]);
					}
				}
			}
		}
		
		sc.close();

	}

}
