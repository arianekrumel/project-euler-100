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
		int thirdTerm = firstTerm + secondTerm;
		int term;
		int sum = 0;
		
		while(firstTerm <= 4000000)
		{
			sum+=thirdTerm;
			term = firstTerm;
			firstTerm = secondTerm;
			secondTerm += term;
		}
		System.out.println("Final Sum: "+ sum);
	}
	
}
