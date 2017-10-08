
public class TLlib {
//Tyson Lawrence Period 2 Project 1.1 MethodMadness october 5
	public static void main(String[] args) {
      multiplicationTable (3,30); Powers (2,4);
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
     public static string DateStr (String str)
     {int month>0;
      int month<=12;
      int day>0;
      int day<=31;
      int year>0;
     String str=(month+"/"+date+"/"+year);
      String month=str.substring(0,2);
      String date=str.substring(3,5);
      String year=str.substring(6);
      return day+"-"+month+"-"+year; 
     }
}
