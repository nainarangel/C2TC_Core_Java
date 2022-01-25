package Patterns;

import java.util.Scanner;

public class LeftTriangle {

	public static void main(String[] args) {
		System.out.print("Enter the number of rows you want : ");
		Scanner sc=new Scanner(System.in);  
		int row= sc.nextInt();
		for (int i=1; i<=row; i++)   
		{        
			for(int j=1;j<=row;j++) {
				if(j<=row-i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
