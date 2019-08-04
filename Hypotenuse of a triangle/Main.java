#include<stdio.h>
#include<math.h>
int main()
{
  float hyp,opp,adj;
  scanf("%f%f",&adj,&opp);
  hyp=sqrt((adj*adj)+(opp*opp));
  printf("%0.2f",hyp);
  //Type your code here
  return 0;
}