package FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	
	public List<String>fizzBuzz(int n)
	{
		List<String>elements=new ArrayList<String>();
		
		for(int i=1;i<=n;i++)
		{
			
			if(i%3==0&&i%5==0)
			{
				elements.add("FizzBuzz");
			}
			else if(i%5==0)
			{
				elements.add("Buzz");
			}
			else if(i%3==0)
			{
				elements.add("Fizz");
			}
			else
			{
				elements.add(String.valueOf(i));
			}
		}
		
		return elements;
		
	}
}
