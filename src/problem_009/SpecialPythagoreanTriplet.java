package problem_009;

/**
 * Problem #9
 * 06/28/2020 
 * XX minutes
 * @author arianekrumel
 */

public class SpecialPythagoreanTriplet {
	public static void main(String[] args)
	{
		System.out.println("SpecialPythagoreanTriplet");
		
		for(int i=1; i<1000; i++)
		{
			for(int j=1; j<1000; j++)
			{
				int a = i;
				int b = a+j;
				int c = 1000-a-b;
				
				if(c*c == (a*a+b*b))
				{
					System.out.println("Product: "+ a*b*c);
					break;
				}
			}
		}
	}
}
