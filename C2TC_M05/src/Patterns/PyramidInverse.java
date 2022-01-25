package Patterns;

import java.util.Scanner;

public class PyramidInverse {

	public static void main(String[] args) {
		System.out.print("Enter the number of rows you want : ");
		Scanner sc=new Scanner(System.in);  
		int row= sc.nextInt();
		for(int i = row; i >= 1; i--)
	    {
	        for(int j = i; j < row; j++)
	        {
	            System.out.print(" ");
	        }
	        for(int j = 1; j <= (2 * i - 1); j++)
	        {
	            System.out.print("*");
	        }
	        System.out.println("");
	    } 

	}

}
