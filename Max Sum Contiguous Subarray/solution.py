class Solution:
    # @param A : tuple of integers
    # @return an integer
    def maxSubArray(self, A):
        sum_so_far = A[0]
        max_so_far = A[0]
        for i in range(1,len(A)):
            if sum_so_far < 0:
                sum_so_far = 0
            sum_so_far = sum_so_far + A[i]
            if max_so_far < sum_so_far:
                max_so_far = sum_so_far
        return max_so_far
