package Basics;
import java.util.*;

public class SieveOfEratosthenes {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        boolean[] arr = new boolean[n];

        for(int i=0; i<n; i++)
        {
            arr[i]=true;
        }

        for(int p=2; p*p<n; p++)
        {
            if(arr[p]==true)
            {
                for(int i=p*p; i<n; i=i+p)
                {
                    arr[i]=false;
                }
            }
        }

        for(int i = 2; i < n; i++)
        {
            if(arr[i] == true)
                System.out.print(i + " ");
        }


    }
}
