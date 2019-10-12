// Longest Common Subsequence Implementation
#include<bits/stdc++.h>

using namespace std;

void printlcs(int n, char *p, string A, int i, int j){
	//Function to print the LCS
	if(i==0 || j==0){
		return;
	}
	if(*((p+i*n) + j) == '\\'){
		printlcs(n, p, A, i-1, j-1);
		cout<<A[i-1];
	}
	else if(*((p+i*n) + j) == '|'){
		printlcs(n, p, A, i-1, j);
	}
	else if(*((p+i*n) + j) == '-'){
		printlcs(n, p, A, i, j-1);
	}
}

void lcs(string A, string B, int m, int n){
	//Function to calculate longest common subsequence
	int l[m+1][n+1], i, j;
	char p[m+1][n+1];
	for(i=0; i<=m; i++){
		l[i][0] = 0;
	}
	for(i=0; i<=n; i++){
		l[0][i] = 0;
	}
	for(i=0; i<=m; i++){
		p[i][0] = ' ';
	}
	for(i=0; i<=n; i++){
		p[0][i] = ' ';
	}
	for(i=1; i<=m; i++){
		for(j=1; j<=n; j++){
			if(A[i-1] == B[j-1]){
				//cout<< A[i]<<" in A at "<<i<<" " <<B[j]<<" in B at "<<j<<"\n";
				l[i][j] = l[i-1][j-1] +1;
				p[i][j] = '\\';
			}
			else{
				if(l[i-1][j] >= l[i][j-1]){
					l[i][j] = l[i-1][j];
					p[i][j] = '|';
				}
				else if(l[i][j-1] > l[i-1][j]){
					l[i][j] = l[i][j-1];
					p[i][j] = '-';
				}
			}
		}
	}
	for(i=0;i<=m;i++){
		for(j=0;j<=n;j++){
			cout<<l[i][j]<<" ";
		}
		cout<<"\n";
	}
	for(i=0;i<=m;i++){
		for(j=0;j<=n;j++){
			cout<<p[i][j]<<" ";
		}
		cout<<"\n";
	}
	cout<<"The length of longest common subsequence is "<<l[m][n];
	cout<<"\nThe longest common subsequence is ";
	printlcs(n+1, (char*)p, A, m, n);
	cout<<"\n";
}

int main(){
	string A, B;
	int m, n;
	cout<<"Enter first sequence:\t";
	getline(cin, A);
	cout<<"Enter second sequence:\t";
	getline(cin, B);
	m = A.length();
	n = B.length();
	lcs(A, B, m, n);
	return 0;
}
