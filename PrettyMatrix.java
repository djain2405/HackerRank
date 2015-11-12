package matrix;

public class PrettyMatrix {

	public static void printmat(int a)
	{
		int [][] ar = new int[2*a-1][2*a-1];
	    int temp = a;
	    int count = 0;
	    int i = 0;
	    int j = 0;
	    for(count = 0; count < temp; count++)
	    {
	        for(i = count; i < (2*(temp)-1-count); i++)
	        {
	            for(j = count; j < (2*(temp)-1-count); j++)
	            {
	                if((i==count)||(j == count)||(i == (2*(temp)-2-count)) || (j == (2*(temp)-2-count)))
	                {
	                    ar[i][j] = temp-count;
	                }
	            }
	        }
	      
	    }
	    
	    for(i = 0 ;i < (2*a-1); i++)
	    {
	        for(j = 0; j < (2*a-1); j++)
	        {
	            System.out.print(ar[i][j]);
	        }
	        System.out.println();
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printmat(4);
	}

}
