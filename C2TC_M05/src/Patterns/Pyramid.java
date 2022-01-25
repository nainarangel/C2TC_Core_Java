package Patterns;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		System.out.print("Enter the number of rows you want : ");
		Scanner sc=new Scanner(System.in);  
		int row= sc.nextInt();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row-i-1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
