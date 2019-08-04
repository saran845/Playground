#include <stdio.h>
int main() {
  int num,i;
  scanf("%d",&num);
  for(i=1;i<=num;++i)
  {
    if(num%i==0)
    {
      printf("%d \n",i);
    }
  }
	//Type your code
	return 0;
}