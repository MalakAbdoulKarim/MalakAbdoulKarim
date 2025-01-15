void printTriangle(int n, int k)
{
	if(n < 1){return;
	}
	if(n%2==0){
		n = n + 1;
		} 
		System.out.println(makeLine(k, ' ') + makeLine(n, 'O'));printTriangle(n - 2, ++k);
}
