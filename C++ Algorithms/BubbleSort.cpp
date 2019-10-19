#include <iostream>
using namespace std;
void swapper(int* x, int* y){
	int temp = *x;
	*x = *y;
	*y = temp;
}

void bubbleSort(int array[], int n){
	for(int i = 0; i < n-1; i++){
		for(int j = 0; j < n-i-1; j++){
			if(array[j] > array[j+1]){
				swapper(&array[j], &array[j+1]);
			}
		}
	}
}

int main(){
	int array[] = {5,-13,23,33,-21,45,16};
	int n = 7;
	cout << "Array before sorting: " << endl;
	for(int i = 0; i < 7; i++){
		cout << array[i] << ", ";
	}
	cout << endl;
	bubbleSort(array,n);
	cout << "Array after sorting: " << endl;
	for(int i = 0; i < 7; i++){
		cout << array[i] << ", ";
	}
	cout << endl;
	return EXIT_SUCCESS;
}