
public class TLlib {
//Tyson Lawrence Period 2 Project 1.1 MethodMadness october 5
	
	public static void main (String [] args){
	 multiplicationTable (3,30); dateStr ("11/7/09");Powers(2,10); 
	}

    public static void multiplicationTable (int base, int range)
    {int n=0;
      while (n<=range)
     {System.out.println (base*n);
      n++;
     }
    }
    public static void Powers (int base1, int range1)
    {int n1=0;
     while (n1<=range1)
     {System.out.println (Math.pow(base1, n1));
     n1++;
     }
    
      
     }
   
     
    public static void dateStr (String full)
     {
      String months=full.substring(0,2);
      String date=full.substring(3,4);
      String years=full.substring(5);
      System.out.println(date+"-"+months+"-"+years);} 
     
}
