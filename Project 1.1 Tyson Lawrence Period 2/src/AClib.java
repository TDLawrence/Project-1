//fjruiejhfo
public class AClib {
	public static void main (String[] args) {
	}
	public static int sumUpTo (int z) {
		int sum = 0;
		for (int x=0; x<=z; x++) {
		      sum += x;
		    }
		    return sum;
	    }
	    
	    public static boolean isPalindrome (String s) {
	            int L = s.length();
	            for (int i=0; i< (L/2); i++) {
	                if (s.substring (i,i+1)!= s.substring (L-i-1, L-i)) {
	                    return false;
	            }
	        }
	        return true;
	    }
	    //palindrome keeps returning false????
		    
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
