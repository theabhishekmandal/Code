#include<stdio.h>
#include<string.h>
int main()
{
int t,i,j;
scanf("%d",&t);
while(t--)
{
    int count=0;
char a[101],b[101];
scanf("%s",a);
scanf("%s",b);
for(i=0;i<strlen(b);i++)
{
for(j=0;j<strlen(a);j++)
{
if(a[j]==b[i])
{
count++;
break;
}
}
}
printf("%d\n",count);
}
return 0;
}