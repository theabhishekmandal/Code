#include <iostream>
using namespace std;
int main() {
    // your code goes here
    int t,n,k;
    cin>>t;
    while(t--)
    {
    	int m=0;
    cin>>n;
    while(n!=0)
    {
    k=n;
    n=n/10;
    k=k%10;
    m=(m*10)+k;
    }
    cout<<m<<endl;
    }
    return 0;
    }