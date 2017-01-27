class Solution:
    # @param A : list of integers
    # @return a list of integers
    def maxset(self, A):
        curr_sum = 0
        max_sum = 0
        curr_start = 0
        curr_end = 0
        max_start = 0
        max_end = 0
        for i in range(0, len(A)):
            if A[i] >= 0: #positive number, add to existing subaray and update current sum
                curr_sum += A[i]
                curr_end = i+1
            if A[i] < 0 or i == len(A)-1: #negative number or end of list, break and check
                if ((curr_sum > max_sum) or (curr_sum == max_sum and curr_end - curr_start > max_end - max_start)):
                    max_start = curr_start
                    max_end = curr_end
                    max_sum = curr_sum
                curr_sum = 0
                curr_start = i+1
        return A[max_start:max_end]