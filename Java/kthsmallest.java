import java.util.*;
class union
{ 
  
    static int kth(int[] arr1, int[] arr2, int k, int st1, int st2, int end1, int end2)  
    { 
        int b1[] = Arrays.copyOfRange(arr1, st1, end1);
        int b2[] = Arrays.copyOfRange(arr2, st2, end2);
        if(k < 0 || k >= (b1.length + b2.length)){
            return 12345;
        }
        if (b1.length == 0){ 
            //System.out.println("From 1");
            return arr2[k];} 
        if (b2.length == 0){ 
            //System.out.println("From 2");
            return arr1[k];} 
        int mid1 = (b1.length) / 2; 
        int mid2 = (b2.length) / 2; 
        if (mid1 + mid2 < k) 
        { 
            if (b1[mid1] > b2[mid2]){
                //System.out.println("From 3.1");
                return kth(b1, b2 , k - mid2 - 1, 0, mid2 + 1, b1.length, b2.length);  
            }
            else{
                //System.out.println("From 3.2");
                return kth(b1, b2, k - mid1 - 1, mid1 + 1, 0, b1.length, b2.length); 
            }
        } 
        else
        { 
            if (b1[mid1] > b2[mid2]){ 
                //System.out.println("From 4.1");
                return kth(b1, b2, k, 0, 0, 0 + mid1, b2.length); }
            else{
                //System.out.println("From 4.2");
                return kth(b1, b2, k, 0, 0, b1.length, 0 + mid2); 
            }
        } 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in first and second sequence:");
        int m, n, k;
        char ch='y';
        m = in.nextInt();
        n = in.nextInt();
        int[] arr1 = new int[m];
        int[] arr2 = new int[n];
        System.out.println("Enter the elements of first sorted sequence:");
        for(int i=0; i<m; i++){
            arr1[i] = in.nextInt();
        }
        System.out.println("Enter the elements of second sorted sequence:");
        for(int i=0; i<n; i++){
            arr2[i] = in.nextInt();
        }
        System.out.println();
        while(ch == 'y'){
        System.out.println("Which smallest element you want?");
        k = in.nextInt();
        int result = kth(arr1, arr2, k-1, 0, 0, arr1.length, arr2.length);
        System.out.println(); 
        if(result != 12345){
            System.out.print("The required smallest element in the union is: " + result);
            System.out.println();
        }
        else{
            System.out.println("The entered value of k is out of bounds!!");
        }
        System.out.println();
        //System.out.println("Executed");
        System.out.println("Wanna more?");
        ch = in.next().charAt(0);
    }
    } 
}  
  
