#include <stdio.h>
int main() {
  int r,n,temp,sum=0;
  scanf("%d",&n);
  temp = n;
  while(n>0)
  {
    r = n % 10;    
   sum = sum + (r*r*r);    
    n = n / 10;    
}    
if(temp==sum)    
printf("Armstrong Number");    
else    
printf("Not an Armstrong Number");  
	//Type your code
	return 0;
}