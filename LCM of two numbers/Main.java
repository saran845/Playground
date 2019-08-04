#include<stdio.h>
int main()
{
  int num1,num2,max_value;
  scanf("%d%d",&num1,&num2);
  max_value=(num1>num2)?num1:num2;
  while(1)
  {
    if(max_value % num1 ==0 && max_value % num2 ==0)
    {
      printf("%d",max_value);
      break;
    }
    ++max_value;
  }
  
  //Type your code here
  return 0;
}