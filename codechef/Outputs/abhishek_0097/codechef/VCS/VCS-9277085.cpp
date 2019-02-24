#include <iostream>

using namespace std;

int main()
{
   int t,i,n,m,k,x;
   cin>>t;
   while(t--)
   {
       cin>>n>>m>>k;
       int a[n],b[n],f=0,t=0;
       for(i=0;i<n;i++)
       {
           a[i]=0; b[i]=0;
       }
       for(i=0;i<m;i++)
       {
           cin>>x;
           a[x-1]=1;
       }
       for(i=0;i<k;i++)
       {
           cin>>x;
           b[x-1]=1;
       }
       for(i=0;i<n;i++)
       {
           if(a[i]==1&&b[i]==1){
           f++;
           }

           else
            if(a[i]==0&&b[i]==0)
            {
            t++;
            }
        }
        cout<<f<<" "<<t<<endl;
   }
    return 0;
}