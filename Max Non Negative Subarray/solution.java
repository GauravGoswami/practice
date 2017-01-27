public class Solution {
	public ArrayList<Integer> maxset(ArrayList<Integer> a) {
		if (a.size() == 0)
		{
			return new ArrayList<Integer>();
		}
		long sum = 0;
		long max = 0;
		int curr_start = 0; int curr_end = 0;
		int max_start = 0; int max_end = 0;
	    for (int i=0;i<a.size();++i)
		{
			if (a.get(i) >= 0)
			{
				sum += a.get(i);
				curr_end = i;
			}
			if (a.get(i) < 0 || i == a.size()-1)
			{
				if (sum >= 0 && (sum > max || (sum == max && curr_end - curr_start > max_end - max_start)))
				{
					max = sum;
					max_start = curr_start;
					max_end = curr_end;
				}
				curr_start = i+1;
				sum = 0;
			}
		}
		ArrayList<Integer> result = new ArrayList<Integer>(max_end - max_start);
		for (int i=max_start;i<=max_end;++i)
		{
		    if (a.get(i) >= 0)
		    {
		        result.add(a.get(i));
		    }
		}
		return result;
	}
}
