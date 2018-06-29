#include<stdio.h>
#include<stdlib.h>
int main()
{
    int t;
    scanf("%d",&t);
    while(t--)
    {
        int d,n;
        scanf("%d%d",&d,&n);
        while(d)
        {
            n=(int)(n*(n+1))/2;
         d--;
        }
        printf("%d\n",n);
    }
    return 0;
}