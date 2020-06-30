package problem02;
/**
 * Problem #2
 * 06/20/2020 
 * @author arianekrumel
 *
 */
public class EvenFibonacciNumbers {
	
	public static void main(String[] args)
	{
		int firstTerm = 1;
		int secondTerm = 2;
		int term = 3;
		
		int sum = 2;
		
		while(term <= 4000000)
		{
			term = firstTerm + secondTerm;
			
			if(term%2 == 0)
			{
				sum += term;
			}

			firstTerm = secondTerm;
			secondTerm = term;
			
			System.out.println("Current: "+ term);
			System.out.println("Sum: "+ sum);
		}
		System.out.println("Final Sum: "+ sum);
	}
}
