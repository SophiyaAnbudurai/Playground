#include<stdio.h> 
int main() 
{
int array[100], size, i, j,c=0;
scanf("%d", &size);
for(i = 0; i < size; i++)
{
scanf("%d", &array[i]);
}
for(i = 0; i < size; i++) 
{
for (j=0; j<i; j++)
{
if (array[i] == array[j])
break;
}    
if (i == j)
{
/* No duplicate element found between index 0 to i */
c++;
}
}  
printf("%d",c);
 return 0;
}
