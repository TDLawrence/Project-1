
public class AClib {
//Amy Chen Period 2 Method Madness
	public static void main (String[] args) {
		System.out.println(sumUpTo(5));
		System.out.println(isPalindrome("ac"));
		System.out.println(isFibonacci(2));
	}
	public static int sumUpTo (int z) {
		int sum = 0;
		for (int x=0; x <= z; x++) {
		      sum = sum + x;
		    }
		    return sum;
	    }
		//int x is counting up to the input value. sum = sum + x takes the sum of all the values from 0 to z, and adds the sum to itself again.
	    
	    public static boolean isPalindrome (String s) {
	            int L = s.length();
	            for (int i=0; i <= L/2; i++) {
	            	System.out.println(i);
	                if (!s.substring (i,i+1).equals (s.substring (L-i-1, L-i))) {
	                    return false;
	            }
	        }
	        return true;
	    }
		/*The if statement is comparing the first and last chars of the input until it hits the middle. 
		 * The i value counts up to the middle of the string.
		 * If the first char is not equal to the last, it returns false. Otherwise, it returns true.
		 */
		public static boolean isFibonacci(int n) {
	        int x = 5*n*n + 4;
	        int y = 5*n*n - 4;
	        if (Math.sqrt(x) == (int)Math.sqrt(x)) {
	            return true;
	            }
		    if (Math.sqrt(y) == (int)Math.sqrt(y)) {
		        return true;
		        }
		        return false;
		        }
}
		/*A value n is in the fibonacci sequence if 5*n^2 + 4 or 5*n^2 - 4 is a perfect square. If the resulting value is not a perfect 
		 * square if the method returns false.
		 */