package problem_009;

/**
 * Problem #9
 * 06/26/2020 
 * 6 minutes
 * @author arianekrumel
 */

public class SpecialPythagoreanTriplet {
	public static void main(String[] args)
	{
		System.out.println("SpecialPythagoreanTriplet");
		
		for(int i=1; i<1000/2; i++)
		{
			int a = i;
			for(int j=1; j<1000/3; j++)
			{
				int b = a+j;
				int c = 1000-a-b;
				if(a*a + b*b == c*c)
				{
					System.out.println("A: "+ a);
					System.out.println("B: "+ b);
					System.out.println("C: "+ c);
					System.out.println("Product: "+ a*b*c);
					break;
				}
			}
		}
	}
}
