boolean isPalindrome(int[]array,int left, int right) {
if (left >= right) {
	return true;
}
if
(array[left] != array[right]) {
return false;
}
return isPalindrome(array, left + 1, right - 1);
}
