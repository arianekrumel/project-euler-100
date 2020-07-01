package problem_006;

/**
 * Problem #6
 * 06/21/2020 
 * 8:19 minutes
 * @author arianekrumel
 */

public class SumSquareDifference {

	public static void main(String[] args)
	{
		System.out.println("SumSquareDifference");
		int ans = getSquareOfSums(100) - getSumOfSquares(100);
		System.out.println(ans);
	}
	
	public static int getSumOfSquares(int n)
	{
		int ans = 0;
		for(int x=1; x<=n; x++)
		{
			ans += x*x;
		}
		return ans;
	}
	
	public static int getSquareOfSums(int n)
	{
		int sum = 0;
		for(int x=1; x<=n; x++)
		{
			//System.out.println(x);
			sum+=x;
		}
		return sum*sum;
	}
}
