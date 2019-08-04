#include<stdio.h>
int main()
{
  int n,a,d,t1,t2,n1;
  scanf("%d",&n);
  if(n%2==1)
  {
    a=0,d=2;
    t1=(n+1)/2;
    n1 = a + (t1-1)*d;
    printf("%d",n1);
  }
  else
  {
    a=0,d=1;
    t2=n/2;
    n1 = a + (t2-1)*d;
    printf("%d",n1);
  }
  
    
	//type your code here
	
}