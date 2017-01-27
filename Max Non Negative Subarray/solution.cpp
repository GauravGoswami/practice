vector<int> Solution::maxset(vector<int> &A) {
    if (A.empty())
    {
		return *(new vector<int>());
    }
    long long int sum = 0;
	long long int max = 0;
	int curr_start = 0;
	int curr_end = 0;
	int max_start = 0;
	int max_end = 0;
	for (int i=0; i < A.size(); ++i)
	{
		if (A[i] >= 0)
		{
			sum += A[i];
			curr_end = i;
		}
		if (A[i] < 0 || i == A.size() - 1)
		{
			if ((sum > max) || ((sum == max) && ((curr_end - curr_start) > (max_end - max_start))))
			{
				max = sum;
				max_start = curr_start;
				max_end = curr_end;
			}
			sum = 0;
			curr_start = i+1;
		}
	}
	vector<int> result;
	for (int i=max_start;i<=max_end;++i)
	{
	    if (A[i] >= 0) //to handle the all negative array case since both max_start and max_end being 0 will still execute the loop once
	    {
	        result.push_back(A[i]);
	    }
	}
	return result;
}
