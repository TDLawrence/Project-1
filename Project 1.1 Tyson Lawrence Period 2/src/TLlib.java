
public class TLlib {
//Tyson Lawrence Period 2 Project 1.1 MethodMadness october 5
	public static void main(String[] args) {
      multiplicationTable (3, 30);Powers (2,17);
	}

    public static void multiplicationTable (int base, int range)
    {int n=0;
      while (n<=range)
     {System.out.println (base*n);
      n++;
     }
    }
    public static void Powers (int base1, int range1)
    {int n=0;
     if (n<=range1)
     {System.out.println (base1^n);}
    }
}
