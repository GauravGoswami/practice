int Solution::maxSubArray(const vector<int> &A)
{
    
    long long int sum_so_far = A[0]; //maintain the current sum, refresh when current sum does not contribute positively to the net sum
    long long int max_sum_so_far = A[0]; //first solution, returned in case of an array with size 1
        
    for (int i=1;i<A.size();++i)
    {
        if (sum_so_far < 0) //negative contribution, refresh
        {
            sum_so_far = 0;
        }
        sum_so_far += A[i]; //update
        if (sum_so_far > max_sum_so_far) //check and update max if we have found new max sum
        {
            max_sum_so_far = sum_so_far;
        }
        //cout << "Sum so far: " << sum_so_far << endl;
        //cout << "Max sum so far: " << max_sum_so_far << endl;
    }
    return max_sum_so_far;
}