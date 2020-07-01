package problem_003;
/**
 * Problem #3
 * 06/21/2020 
 * 8+ minutes
 * @author arianekrumel
 *
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
		//long n = 600851475143; //13195;
		long n = 600851475143L;
		int x = 3;
		int factor = 1;
		while(x<=n)
		{
			System.out.println("try: " + factor);
			if(n%x == 0)
			{
				factor = x;
			}
			x = getNextPrime(x);
		}
		System.out.println("ans: " + factor);
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
	
	public static int getNextPrime(int n)
	{
		n++;
		while(!isPrime(n))
		{
			n++;
		}
		return n;
	}
}
