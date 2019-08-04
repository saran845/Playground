#include <stdio.h>
int main() {
  int num, seconddigit,count;
  scanf("%d",&num);
  seconddigit = num;
  while(num > 10)
  {
    seconddigit = num% 10;
    num = num/10;
  }
  printf("%d",seconddigit);
	//Type your code
	return 0;
}