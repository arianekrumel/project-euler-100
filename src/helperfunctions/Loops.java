package helperfunctions;

/*
 * Notes
 * Make sure you don't have an infinite loop
 * Don't alter what you are iterating
 * Don't use the counter unaltered in your content code
 * - check that your iterations are doing what you think
 * - for vs. while
 * - init variables
 * - break vs. continue
 * - are you doing too many separate loops?
 */

public class Loops {

	public static void main(String[] args)
	{
		// FOR loop: fixed iterations
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		// FOR EACH loop: iterate over a collection
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : cars) {
		  System.out.println(i);
		}
		
		// WHILE loop: iterations are not fixed
        int x = 1; 
        
        while (x <= 4) 
        { 
            x++; 
        }
        System.out.println("Value of x:" + x); 
        
        // DO WHILE loop: execute at least once
        x = 21; 
        do
        { 
            // The line will be printed even 
            // if the condition is false 
            x++; 
        } 
        while (x < 20); 
        System.out.println("Value of x:" + x); 
        
        // BREAK: stop loop and go to next statement after loop
        int i;
        for (i = 0; i < 5; i++) {
            if (i >= 2) {
                break;
            }
            System.out.println("Foo");
        }
        System.out.println(i);
	     // Output:
	     // Foo
	     // Foo
	     // 2
        
        // CONTINUE: stop current iteration and move to next iteration
        // inside for loop, will still increment i
        for (i = 0; i < 5; i++) {
            if (i >= 3) {
                break;
            }
            System.out.println("Foo");
            if (i >= 1) {
                continue;
            }
            System.out.println("Bar");
        }
        System.out.println(i);
	     // Output
	     // Foo
	     // Bar
	     // Foo
	     // Foo
	     // 3
	}
}
