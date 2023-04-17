package SumOfArray;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[]args)
	{
	
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		size=sc.nextInt();
		int []nums=new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println(i+". enter the num of array: ");
			nums[i]=sc.nextInt();
			
		}		
		
		RunningSum sumOfArray=new RunningSum();
        int [] result=sumOfArray.runningSum(nums);
		

       for(int i=0;i<size;i++)
       {
    	      System.out.println(result[i]);
       }
		
	}
	
}
