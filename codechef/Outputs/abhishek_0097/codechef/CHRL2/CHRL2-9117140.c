#include<stdio.h>


int main()
{

    char a;
     long long int c,h,e,f,i;
    i=c=h=e=f=0;
    while((scanf("%c",&a))&&a!='\n')
    {
      switch(a)
      {
          case 'C': c++; break;
          case 'H': if(h<c)h++;break;
          case 'E': if(e<h)e++;break;
          case 'F': if(f<e)f++;break;
          default:break;

      }
    }

    printf("%lld",f);
    return 0;


}