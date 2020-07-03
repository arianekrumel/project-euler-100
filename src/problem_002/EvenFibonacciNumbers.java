package problem_002;
/**
 * Problem #2
 * 06/28/2020 
 * @author arianekrumel
 */
public class EvenFibonacciNumbers {
	
	public static void main(String[] args)
	{
		int firstTerm = 1, secondTerm = 2;
		int term = 3;
		int sum = 0;
		
		while(term <= 4000000)
		{
			term = firstTerm;
			firstTerm = secondTerm;
			secondTerm += term;
			
			if(term%2 == 0)
			{
				sum += term;
			}
		}
		System.out.println("Final Sum: "+ sum);
	}
	
}
