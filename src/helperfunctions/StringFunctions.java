package helperfunctions;

public class StringFunctions {
	public static void main(String[] args)
	{
		System.out.print(isPalindrome3(101));
		System.out.print(isPalindrome3(10101));
		System.out.println(isPalindrome3(100));
		
		System.out.print(isPalindrome(101));
		System.out.print(isPalindrome(10101));
		System.out.println(isPalindrome(100));

		System.out.print(isPalindrome2(101));
		System.out.print(isPalindrome2(10101));
		System.out.println(isPalindrome2(100));
		System.out.println("");
		
		char[] c = {'h', 'e', 'l', 'l', 'o'};
		System.out.println(c);
		strRev(c, 0, 1);
		System.out.println(c);
	}
	
	public static boolean isPalindrome3(int x)
	{
	    int n = 0;
	    int m = x; // save original x

	    // Check all the digits of x
	    while (x > 0) {
	    	// Use modulo to grab last digit of x
	    	// for n=0, x=1234, n=0+4=4
	    	// for n=4, x=123, n=40+3=43
	    	// for n=43, x=12, n=430+2=432
	    	// for n=432, x=1, n=4320+1=4321
	        n = n * 10 + x % 10;
	        // division by 10 in integers removes last digit
	        x = x / 10; //x = x / 10 | 0;
	    }
	    
	    // Check equality
	    return n == m;
	}
	
	// modulo 10 gets last digit
	// modulo 100 gets two last digits
	// modulo 1000 get three last digits
	
	// division 10 removes last digit (int)
	// division 100 removes last digit (int)

	public static boolean isPalindrome(int x)
	{
		String xString = String.valueOf(x);
		int lenght = xString.length();
		int start = 0;
		int end = lenght-1;
		while(start != end && start < end)
		{
			if(xString.charAt(start)!=xString.charAt(end))
			{
				return false;
			}
			start++;
			end--;
		}
		
		return true;
	}
	
	public static boolean isPalindrome2(int x)
	{
		String xString = String.valueOf(x);
		 
        StringBuilder input1 = new StringBuilder(); 
  
        // append a string into StringBuilder input1 
        input1.append(xString); 
  
        // reverse StringBuilder input1 
        input1 = input1.reverse(); 
        
        // compare string objects
		return xString.equals(input1.toString());
	}
	
	  public static void strRev(char[] str, int start, int end) {
		    if (str == null || str.length < 2) {
		      return;
		    }

		    while (start < end) {

		      char temp = str[start];
		      str[start] = str[end];
		      str[end] = temp;

		      start++;
		      end--;
		    }
		  }
}
