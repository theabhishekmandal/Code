#include <stdio.h>

int main(void) {
	int a,b,c;
	scanf("%d%d",&a,&b);
	if(a>b)
	{
	    c=(a-b)%10;
	    if(c>1&&c<=9)
	    c=a-b-1;
	    else 
	      if(c==0||c==1)
	         c=a-b+1;
	         
	         printf("%d",c);
	}
	return 0;
}