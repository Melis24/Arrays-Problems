package TwoDimensionalArrays;

public class Wealth {
	
	private int wealth;
	private int[] sum;
	
	public int maxiumWealth(int [][] accounts)
	{
		sum=new int[accounts.length];
		for(int i=0;i<accounts.length;i++)
		{
			for(int j=0;j<accounts[i].length;j++)
			{
				sum[i]+=accounts[i][j];
			}		
		}
		
		wealth=sum[0];
		for(int k=0;k<accounts.length;k++)
		{
			   if(sum[k]>=wealth)
				{
					wealth=sum[k];
				}
			
		}
		return wealth;	
		
	}


}
