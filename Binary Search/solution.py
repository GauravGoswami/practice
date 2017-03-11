def bin_search(A, left, right, k):
	if A[left] == k:
		return left
	if A[right] == k:
		return right
	if left == right or right - left == 1:
		return -1
	mid = int((left+right)/2)
	if k < A[mid]:
		return bin_search(A, left, mid, k)
	else:
		return bin_search(A, mid, right, k)