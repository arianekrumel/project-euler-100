package problem_006;

/**
 * Problem #6
 * 06/28/2020 
 * @author arianekrumel
 */

public class SumSquareDifference {

	public static void main(String[] args)
	{
		System.out.println("SumSquareDifference");
		int n = 100;
		
		int sumOfSquares = 0;
		int sums = 0;
		for(int x=1; x<=n; x++)
		{
			sumOfSquares += x*x;
			sums+=x;
		}
		int ans = (sums*sums) - sumOfSquares;
		System.out.println(ans);
	}
}
