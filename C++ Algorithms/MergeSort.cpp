#include<iostream>
using namespace std;
void merge ( int a[], int beg, int mid, int end)
{
	int i = beg , j = mid + 1 , temp[100] , k = beg; 
	while ( i <= mid && j <= end )
	{
		if( a[i] <= a[j] )
		{
			temp[k] = a[i];
			k++;
			i++;
		}
		else if( a[j] <= a[i] )
		{
			temp[k] = a[j];
			k++;
			j++;
		}
	}
	while ( i <= mid)
	{
		temp[k] = a[i];
		k++;
		i++;
	}
	while ( j <= end)
	{
		temp[k] = a[j];
		k++;
		j++;
	}
	for(i=beg;i<k;i++)
		a[i] = temp[i] ;
}


void merge_sort(int a[], int l, int h)
{
	if( l < h )
	{
		int mid = ( l + h ) / 2;
		merge_sort( a, l, mid);
		merge_sort( a, mid+1, h);
		merge( a, l, mid, h);
	}
}
int main()
{
	int n , i, ch;
	cout<<"\nEnter the number of elements: ";
	cin>>n;
	int a[n];
	cout<<"\nEnter "<<n<<" array elements: ";
	for( i = 0 ; i < n ; i++)
		cin >> a[i];
	merge_sort( a, 0, n-1 );
	cout<<"Sorted Array:\n";
	for(int i = 0 ; i < n; i++ )
		cout<<a[i]<< "  ";
}
