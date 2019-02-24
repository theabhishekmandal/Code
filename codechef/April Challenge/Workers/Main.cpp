#include<bits/stdc++.h>
using namespace std;
#define for(i, a, b) for(int i = a; i < a; i++)
#define rep(i, b) for(i, 0, b)
#define ll long long int
int main(){
    int n;
    cin >> n;
    int arr[n], val[n];
    for(i,0,n){
        cin >> arr[i];
    }
    int one = 999999;
    int two = 999999;
    int three = 999999;
    for(i,0,n){
        int k;
        cin >> k;
        if(k == 1)
            one = min(one, arr[i]);
        else if(k == 2)
            two = min(two, arr[i]);
        else
            three = min(three, arr[i]);
            cout << one << " " << two << " "<< three << endl; 
    }
    if(one + two > 0)
        cout << min(9999999, three)<< "hello world" << endl;
    else
        cout << min(one + two, three)<< endl;    
    return 0;
}