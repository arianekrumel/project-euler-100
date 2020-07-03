package problem_003;
/**
 * Problem #3
 * 06/28/2020 
 * @author arianekrumel
 */
public class LargestPrimeFactor {

	public static void main (String[] args)
	{
		System.out.println("LargestPrimeFactor");
		
		System.out.println(isPrime(5).toString());
		System.out.println(isPrime(6).toString());
		System.out.println(isPrime(13195).toString());
		
		// loop through all the prime numbers under and save any factors
		// return the biggest factor
		long n = 600851475143L;
		int factor = 3;
		int lastFactor = 1;
		while(n>1)
		{
			System.out.println("try: " + lastFactor);
			if(n%factor == 0)
			{
				lastFactor = factor;
			}
			factor++;
			while(!isPrime(factor))
			{
				factor++;
			}
		}
		System.out.println("ans: " + lastFactor);
	}
	
	public static Boolean isPrime(int n)
	{
		// If number is even, not prime
		if(n%2==0)
		{
			return false;
		}
		
		int divisor = 3;
		while(divisor<n)
		{
			if(n%divisor == 0)
			{
				return false;
			}
			// skip all even divisors
			divisor = divisor+2;
		}
		return true;
	}
}
