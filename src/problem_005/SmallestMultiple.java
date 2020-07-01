package problem_005;

/**
 * Problem #5
 * 06/21/2020 
 * 9 minutes
 * @author arianekrumel
 */

public class SmallestMultiple {
	// increment from the smallest possible answer
	// smallest 20*19 = 380
	// check divisible by all number under
	// stop incrementing when find one
	
	public static void main(String[] args)
	{
		int ans = 0;
		int temp = 90;
		while(ans==0)
		{
			boolean check = divisbleByAll(temp, 20);
			if(check)
			{
				ans = temp;
			}
			temp++;
		}
		System.out.println(ans);
	}
	
	public static boolean divisbleByAll(int n, int max)
	{
		if(max==0)
			return true;
		if(n%max!=0)
			return false;
		return divisbleByAll(n, max-1);
	}
}
