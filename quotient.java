int quotient(int m, int k)
{
if(k ==0)
{
return 0;
}
else if(m-k == 0){
return 1;
}else if(m < k)
{
return 0;
}
else
{
return quotient(m - k, k) + 1;
} 
}
