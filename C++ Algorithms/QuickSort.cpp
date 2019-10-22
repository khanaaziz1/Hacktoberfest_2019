#include<iostream>
using namespace std;
int partition( int a[], int beg, int end)
{
	int flag = 0, temp ;
	int left = beg, loc = beg, right = end ;
	while ( flag == 0)
	{
		while ( a[right] >= a[loc] && right != loc )
				right --;
		if( right == loc)
			flag = 1;
		else if( a[right] < a[loc] )
		{
			temp = a[right] ;
			a[right] = a[loc] ; 
			a[loc] = temp ;
			loc = right;
		}
		if (flag == 0)
		{
			while ( a[left] <= a[loc] && left != loc )
				left ++;
			if(left == loc)
				flag = 1;
			else if ( a[left] > a[loc] )
			{
				temp = a[left] ;
				a[left] = a[loc] ;
				a[loc] = temp;
				loc = left ;
			}
		}
	}
	return loc;
}
void quick_sort( int a[] , int beg, int end )
{
	if( beg <= end )
	{
		int loc = partition ( a, beg, end );
		quick_sort( a, beg, loc -1 );
		quick_sort( a, loc + 1 , end);
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
	quick_sort( a, 0, n-1 );
	cout<<"Sorted Array:\n";
	for(int i = 0 ; i < n; i++ )
		cout<<a[i]<< "  ";
}
