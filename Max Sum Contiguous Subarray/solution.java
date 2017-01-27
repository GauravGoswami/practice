public class Solution {
	// DO NOT MODFIY THE LIST. 
	public int maxSubArray(final List<Integer> a) {
	    int sum_so_far = a.get(0);
	    int max_so_far = a.get(0);
	    
	    for (int i=1;i<a.size();++i)
	    {
	        if (sum_so_far < 0)
	        {
	            sum_so_far = 0;
	        }
	        sum_so_far += a.get(i);
	        if (max_so_far < sum_so_far)
	        {
	            max_so_far = sum_so_far;
	        }
	    }
	    return max_so_far;
	}
}
