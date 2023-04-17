package TwoDimensionalArrays;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[]args)
	{
	
		int line;
		int column;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the line and column of array: ");
		line=sc.nextInt();
		column=sc.nextInt();
		int[][] nums=new int[line][column];
		
		for(int i=0;i<line;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.println("Enter number of arrays: ");
				nums[i][j]=sc.nextInt();
			}
		}
		
		Wealth resultWealth=new Wealth();
		System.out.println(resultWealth.maxiumWealth(nums));

	}

}
