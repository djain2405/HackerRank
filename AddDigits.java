
public class AddDigits{
	public static int addDigits(int num) {
        if(num < 10)
            return num;
        int sum = 0;
        
        while(num > 0)
        {
            sum += num%10;
            num = num/10;
        }
        
        int temp = addDigits(sum);
        
        return temp;
        
    }
	public static int addDigitsInConstantTime(int num) {
        if(num == 0)
            return num;
        else if(num%9 == 0)
        	return 9;
        else
        	return num%9;
         
    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addDigitsInConstantTime(36));
	}

}
