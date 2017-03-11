public class Solution {
    
    public ArrayList<Integer> heapSort(ArrayList<Integer> inp)
	{
		int count = inp.size();
		minheapify(inp, count);
		int end = count-1;
		while(end > 0)
		{
			swap(inp, end, 0);
			end = end - 1;
			minheap(inp, 0, end);
		}
		return inp;
	}
	
	public void minheapify(ArrayList<Integer> inp, int count)
	{
		int start = count/2 - 1;
		while(start >= 0)
		{
			minheap(inp, start, count - 1);
			start -= 1;
		}
	}
	
	public void minheap(ArrayList<Integer> inp, int start, int end)
	{
		int root = start;
		while(root*2+1 <= end)
		{
			int child = root*2+1;
			int swap = root;
			if(inp.get(swap) < inp.get(child))
			{
				swap = child;
			}
			if(child+1 <= end && inp.get(swap) < inp.get(child+1))
			{
				swap = child+1;
			}
			if(swap != root)
			{
				swap(inp, root, swap);
				root = swap;
			}
			else
			{
				return;
			}
		}
	}
	

	public void swap(ArrayList<Integer> inp, int index1, int index2)
	{
		int holder = inp.get(index1);
		inp.set(index1, inp.get(index2));
		inp.set(index2, holder);
	} 
    
	public ArrayList<Integer> wave(ArrayList<Integer> a)
	{
	    a = heapSort(a);
	    //System.out.println(Arrays.toString(a.toArray()));
	    for (int i=0;i<a.size();i += 2)
	    {
	        if (i+1 < a.size())
	        {
	            int temp = a.get(i);
	            a.set(i,a.get(i+1));
	            a.set(i+1,temp);
	        }
	    }
	    return a;
	}
}