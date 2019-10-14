package Basics;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void rotate(int d, int[] a)
    {
        int n=a.length;
        int[] temp = new int[d];


        for(int i=0; i<d; i++)
        {
            temp[i]=a[i];

        }

        for(int i=d; i<n; i++)
        {
            a[i-d]=a[i];
        }
        int index=0;
        for(int i=n-d;i<n; i++)
        {
            a[i]=temp[index];
            index++;
        }
        System.out.println(Arrays.toString(a));
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int d=sc.nextInt();

        for(int i=0; i<5; i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        rotate(d,arr);



    }
}
