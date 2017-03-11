class Solution:
    # @param A : list of integers
    # @return a list of integers
    def wave(self, A):
        A.sort()
        #print A
        for i in range(0,len(A)-1,2):
            tmp = A[i]
            A[i] = A[i+1]
            A[i+1] = tmp
        return A
