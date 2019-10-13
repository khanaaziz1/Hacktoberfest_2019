package java.mergeSort;

public class Main {
//merge sort works by dividing the array to a single element which is sorted and then sorting while we're merging them on every step to
//larger elements and we should use a recursive method to divide 
    
    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        mergeSort(intArray, 0, intArray.length);

        //iteration to show the result
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
    
   //recursive method
    public static void mergeSort(int[] input, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
      //divide left side
        mergeSort(input, start, mid);
      //and right side  
        mergeSort(input, mid, end);
      //and then merge them on each step  
        merge(input, start, mid, end);
    }
    
    public static void merge(int[] input, int start, int mid, int end) {

        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        // a temporary method to sort
        int[] temp = new int[end - start];
        
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);


    }

}
