
public class PalNumber {
	
	static public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int temp = x;
        if(x < 10)
            return true;
        int rev = 0;

        try
        {
            while(temp != 0)
            {
                rev = temp % 10 + rev * 10;
                temp = temp/10;
            }
        }
        catch(NumberFormatException e)
        {
            return false;
        }
        
        if(rev != x)
            return false;
        else
            return true;
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(isPalindrome(11));

	}

}
