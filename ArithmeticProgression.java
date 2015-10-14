//Find the sum of numbers divisible by 3 or 5 upto n-1
import java.math.BigInteger;
import java.util.*;
public class ArithmeticProgression {

static void print(ArrayList<Integer> arr)
{
	int i = 0;
	for(i = 0; i < arr.size(); i++)
	{
		System.out.println(arr.get(i));
	}
}
public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
	int i = 0;
	for(i = 0; i < t; i++)
	{
		long n = sc.nextInt();
		
	
	    BigInteger sum = new BigInteger("0");
	    long num3 =(long)Math.floor((n-1)/3);
	    long num5 = (long)Math.floor((n-1)/5);
	    long num15 = (long)Math.floor((n-1)/15);
	    System.out.println(num3 + " " + num5 + " "+num15);
	    
	    
	    sum = new BigInteger(String.valueOf((num3*(6+(num3-1)*3))/2));
	    System.out.println(sum);
	    sum = sum.add(new BigInteger(String.valueOf((num5*(10+(num5-1)*5))/2)));
	    System.out.println(sum);
	    sum = sum.subtract(new BigInteger(String.valueOf((num15*(30+(num15-1)*15))/2)));
	    System.out.println(new BigInteger(String.valueOf(sum)));
		//print((arr));
		//System.out.println(sum);
	}
   
}
}
