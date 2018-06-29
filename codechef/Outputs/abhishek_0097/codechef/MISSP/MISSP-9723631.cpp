#include <iostream>

using namespace std;

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        long int n,i,j,temp;
        cin>>n;
        long int a[n],k[n];
        for(i=0;i<n;i++)
        {
            cin>>a[i];
        }
         for(i=0; i<n-1; i++)                     //loop for interation less than the size
    {
for(j=0;j<n-i-1;j++)                          //loop for checking
{
if(a[j]>a[j+1])
{
temp=a[j+1];
a[j+1]=a[j];
a[j]=temp;
}}}
j=0; i=0;
while(i<n)
{
 if(a[i]!=a[i+1])
 {
   k[j]=a[i];
   j++;
   i=i+1;
 }
 else
    if(a[i]==a[i+1])
 {
     i=i+2;
 }
}
  for(i=0;i<j;i++)
  {
  cout<<k[i]<<endl;
  }


}
return 0;
}