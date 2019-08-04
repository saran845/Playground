#include<stdio.h>
int main()
{
  int n,t1=1,t2=0,term,i;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    printf("%d ", t2);
    term = t1+t2;
    t1=t2;
    t2=term;
  }
  //Type your code here
  return 0;
}