#include<stdio.h>
int isvowel(char c)
{
  if(c=='a' || c=='e'|| c=='i' || c=='o' || c=='u' || 
     c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
  {
    return 0;
  }
  else
  {
    return 1;
  }
}
int main()
{
  char str[100],i,a;
  scanf("%[^\n]s", str);
  for(i=0;str[i]!='\0';i++)
  {
    if(isvowel(str[i]))
    {
      printf("%c",str[i]);
    }
  }
  //Type your code here
  
  return 0;
}