import java.util.Arrays;

/*
    A Generics JAVA class providing a few algorithms for sorting.
*/

public class Sorting<T extends Comparable<? super T>> {

    /*
        Selection Sort:
        The algorithm simply searches for the smallest value that has not
        already been looked at. Once the smallest value is found, the two
        values are swapped in the array.
    */                                                                                                                                                                                                               
    public static <T extends Comparable<? super T>> void selectionSort(T[] arr) {                                                                                                                                    
        for (int i = 0; i < arr.length - 1; i++) {                                                                                                                                                                   
            for(int j = i + 1; j < arr.length; j++) {                                                                                                                                                                
                if(arr[j].compareTo(arr[i]) < 0) {                                                                                                                                                                   
                    T temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    /*
        Insertion Sort:
        This sorting algorithm simply looks at the values in a sequential order
        but once a smaller value is found, it is brought all the way to the
        "beginning" of the array.
    */
    public static <T extends Comparable<? super T>> void insertSort(T[] arr) {
        int j;
        for(int i = 1; i < arr.length; i++) {
            T temp = arr[i];
            for(j = i; j > 0 && temp.compareTo(arr[j-1]) < 0; j--)
                arr[j] = arr[j-1];
            arr[j] = temp;
        }
    }
}
