#include<bits/stdc++.h>

using namespace std;

int main(){
	int t;
	cin>>t;
	while(t--){
		int n;
		cin>>n;
		int ar[99999];
		for(int i=0;i<n;i++){
			cin>>ar[i];
		}
		int s=99999, g=0, c=1;
		for(int i=0;i<n-1;i++){
			if(abs(ar[i+1]-ar[i]) <= 2){
				c++;	
			}
			
			if((abs(ar[i+1]-ar[i])>2) || i==n-2){
				if(c>g)
					g=c;
				if(c<s)
					s=c;
				c=1;
			}
			if(ar[i+1]-ar[i]>2 && i==n-2)
				s=1;
		}
		cout<<s<<" "<<g<<endl;
	}
	return 0;
}
