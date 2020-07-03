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
		int a2 = 0;
		int b2 = 0;
		int c2 = 0;
		
		for(int i=1; i<1000; i++)
		{
			int a = i;
			for(int j=1; j<1000; j++)
			{
				int b = a+j;
				a2=(int)Math.pow(a, 2);
				b2=(int)Math.pow(b, 2);
				c2=a2+b2;
				
				double c = Math.sqrt(c2);
				if(c%1!=0) continue;
				int sum = a+b+(int)c;
				if(sum>1500) continue;
				
				if(sum==1000)
				{
					break;
				}
			}
		}
	}
}
