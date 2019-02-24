#include<stdio.h>
#include<stdlib.h>
int main()
{
    int t;
    scanf("%d",&t);
    while(t--)
    {
       long int n,m,c;
       int count=0,i,j;
        scanf("%d%d%d",&n,&m,&c);
        for( i=0;i<=n;i++)
        {
            for( j=0;j<=m;j++)
        {
            if(i*j>c)
                break;
            else if(i*j==c)
                count++;
        }
        }
        printf("%d\n",count);
    }
    return 0;
}