#include <stdio.h>
int main()
{
  int i;
  float a,b[100],c=0;
  scanf("%f",&a);
  for(i=0;i<a;i++)
  {
    scanf("%f",&b[i]);
    c=c+b[i];
  }
  printf("%.2f",c/a);
 return 0;
}
