package problem_001;

/**
 * Problem #1
 * 07/04/2020 
 * 06 minutes
 * @author arianekrumel
 *
 */
public class MultiplesOf3And5 {
	public static void main(String[] args)
	{
		System.out.println("MultiplesOf3And5");
		
		int limit = 1000;
		int sum = 0;
		
		for(int i=1; i<limit; i++)
		{
			boolean alreadyDivisbleBy3 = false;
			if(i%3 == 0)
			{
				sum += i;
				if (i%5 == 0){
					alreadyDivisbleBy3 = true;
				}
			}
			if (i%5 == 0 && !alreadyDivisbleBy3){
				sum += i;
			}
		}
		
		System.out.println(sum);
	}
}
