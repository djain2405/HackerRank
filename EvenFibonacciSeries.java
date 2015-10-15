//Find the sum of numbers divisible by 3 or 5 upto n-1

import java.math.BigInteger;
import java.util.*;
public class EvenFibonacciSeries {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     long i = 0;
        
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
        for(i = 0; i < t; i++)
        {
        	
            long n = sc.nextLong();
            long []arr = new long[100];
            arr[0] = 1;
            arr[1] = 2;
            int j = 1;
            long sum = 2;
            while(arr[j] < n)
            {
            	arr[j+1] = arr[j]+arr[j-1];
            	if(arr[j+1] < n && arr[j+1]%2 == 0)
            		sum += arr[j+1];
            	j++;
            }

	         System.out.println(sum);
        }
	
   
    }
}
