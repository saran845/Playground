#include<stdio.h>
int main()
{
  int n,arr[100],i,r1=0;
  scanf("%d",&n);
  while(n!=0)
  {
    arr[r1++]=n%2;
    n=n/2;
  }
  for(i=r1-1;i>=0;i--)
  {
    printf("%d",arr[i]);
  }
  
  //Type your code here
  return 0;
}