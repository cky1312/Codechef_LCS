#include<bits/stdc++.h>
using namespace std;

int main()
{
  long long t;
  cin>>t;
  while(t--)
  {
      
      long long TS;
      cin>>TS;
    //   int c=0,JS=0;
    if(TS==0)
    {
        cout<<"0"<<"\n";
    }
   while(TS%2==0)
   {
       TS=TS/2;
   }
   cout<<TS/2<<"\n";
  }
  return 0;
}
