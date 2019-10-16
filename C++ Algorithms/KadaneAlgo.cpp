#include<iostream>
#include<string.h>
#include<algorithm>

using namespace std;

int main(){
	
	int a[]={-1,2,4,-5,5,2},s,i,j,m=0,maxi=0;
	s=sizeof(a)/sizeof(a[0]);
	
	for(i=0;i<s;i++){
		m=max(a[i],m+a[i]);
		maxi=max(m,maxi);
	}
	
	cout<<maxi;
}
