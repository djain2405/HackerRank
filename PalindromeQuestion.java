import java.util.*;
public class PalindromeQuestion {

	static boolean isPalindrome(int n)
	  {
	    int i = 0;
	    String str = String.valueOf(n);
	    int []arr = new int[str.length()];
	    for(i = 0; i < str.length(); i++)
	    	arr[i] = str.charAt(i) - '0';
	    i = 0;
	    int j = arr.length-1;
	    
	    while(i < j)
	    {
	      if(arr[i] != arr[j])
	         return false;
	      i++;
	      j--;
	    }
	    return true;
	  }
	  
	         static boolean isthreedigit(int n)
	         {
	           String str = String.valueOf(n);
	    	if(str.length() != 3)
	          return false;
	           else
	             return true;
	         }
	  static boolean isfactor(int n)
	  {
	    int i = 100;
	    while(i < 1000)
	    {
	      if(n%i == 0 && isthreedigit(n/i))
	         {
	           return true;
	         }
	         i++;
	    }
	    return false;
	  } 
	  
	         static int calculatepal(int n)
	         {
	           while(n >= 101101)
	           {
	             if(isPalindrome(n) && isfactor(n))
	               return n;
	             n--;
	           }
	           return 101101;
	           
	         }
	  public static void main(String[] args)
	  {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    System.out.println(calculatepal(n));
	    
	  }

}
