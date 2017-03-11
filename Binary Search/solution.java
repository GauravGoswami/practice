int bin_search(int A[], int left, int right,  int k)
{
	if (A[left] == k)
		return left;
	else if (A[right] == k)
		return right;
	if (left == right || right - left == 1) //termination condition
		return -1;
	int mid = (int) (left + right)/2;
	if (k < A[mid])
		return bin_search(A, left, mid, k);
	else
		return bin_search(A, mid, right, k);
}