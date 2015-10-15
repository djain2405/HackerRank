import java.util.*;
public class LargestPrimeFactor {
	static long largestPrime(long n)
	{
//		int j = 2;
//		while(n != 1)
//		{
//			
//			boolean isPrime = true;
//			long i = 1;
//			for(i = 2; i <= n/2; i++)
//			{
//				if(n%i == 0)
//				{
//					isPrime = false;
//					break;
//				}
//			}
//			if(isPrime)
//			{
//				return n;
//			}
//			else
//			{
//				while(n%j != 0)
//					j++;
//				n = n/j;
//			}
//		}
//		
//		return 1;
		
		int i = 0;
		for(i = 2; i <= n; i++)
		{
			if(n%i == 0)
			{
				n /= i;
				i--;
			}
			
		}
		return i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++)
		{
			long n = sc.nextLong();
			long result = largestPrime(n);
			System.out.println(result);
		}

	}

}
