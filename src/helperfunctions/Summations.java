package helperfunctions;

public class Summations {

	public static void main(String[] args)
	{
		int n = 100;
		System.out.println("The sum of squares up to "+n+" is: "+getSumOfSquaresIterative(n)); // 338350
		System.out.println("The sum of squares up to "+n+" is: "+getSumOfSquaresFormula(n)); // 338350
		System.out.println("The sum numbers up to "+n+" is: "+getSumOfFirstNIterative(n)); // 5050
		System.out.println("The sum numbers up to "+n+" is: "+getSumOfFirstNFormula(n)); // 338350
	}
	
	public static int getSumOfSquaresIterative(int n)
	{
		int sumOfSquares = 0;
		for(int x=1; x<=n; x++)
		{
			sumOfSquares += x*x;
		}
		return sumOfSquares;
	}
	
	//	Sum of Squares Formula for “n” numbers = 12 + 22 + 32 ……. n2 = [n(n + 1)(2n + 1)] / 6
	public static int getSumOfSquaresFormula(int n)
	{

		return (2*n + 1)*(n + 1)*n/6;
	}
	
	public static int getSumOfFirstNIterative(int n)
	{
		int sums = 0;
		for(int x=1; x<=n; x++)
		{
			sums+=x;
		}
		return sums;
	}
	
	//We prove the formula 1+ 2+ ... + n = n(n+1) / 2, for n a natural number.
	public static int getSumOfFirstNFormula(int n)
	{
		return n * (n+1)/2;
	}
}
