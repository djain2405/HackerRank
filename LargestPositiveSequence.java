import java.util.ArrayList;

public class LargestPositiveSequence {

	public static ArrayList<Integer> larPosSeq(int []a)
	{
		ArrayList<Integer> result = new ArrayList<>();
		int sum = 0; int length = 0; int index =0;
		int sum_max = 0; int length_max = 0; int index_min = 0;
		int n = a.length;
		int i = 0;
		for(i = 0; i < n; i++)
		{
			if(a[i] > 0)
			{
				sum += a[i];
				length++;
			}
			else if(a[i] < 0)
			{
				if(sum_max < sum)
				{
					sum_max = sum;
					length_max = length;
					index_min = index;
				}
				sum = 0;
				length = 0; 
				index = i+1;
			}
		}
		if(sum_max < sum)
		{
			sum_max = sum;
			length_max = length;
			index_min = index;
		}
		if(sum == 0)
		{
			return null;
		}
		int j = 0;
		System.out.println("Length_max:"+length_max+" "+index_min);
		for(j = index_min; j < index_min+length_max; j++)
		{
			result.add(a[j]);
		}
//		if(length_max < n)
//		{
//			result.add(a[j]);
//		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {5,2,7,2,3};
		ArrayList<Integer> result = larPosSeq(a);
		if(result == null)
		{
			System.out.println("No Positive number in the list");
		}
		else
		{
		System.out.println(result.size());
		for(int i = 0; i < result.size(); i++)
			System.out.println(result.get(i));
		}
	}

}
