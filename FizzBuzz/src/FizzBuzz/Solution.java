package FizzBuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[]args)
	{
		int sizeList;
		List<String>elements=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size list: ");
		sizeList=sc.nextInt();
		
		FizzBuzz list=new FizzBuzz();
		elements=list.fizzBuzz(sizeList);
		
		for(int i=0;i<sizeList;i++)
		{
			System.out.println(""+elements.get(i)+"");
		}
		
	}
}
