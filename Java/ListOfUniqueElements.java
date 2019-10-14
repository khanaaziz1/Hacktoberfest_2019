package Basics;

import java.util.ArrayList;
import java.util.Scanner;

public class ListOfUniqueElements {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        ArrayList<String> list = new ArrayList<>();

        for(int i=0; i<n; i++)
        {
            String s=sc.nextLine();
            if(list.contains(s))
            {
                continue;
            }
            else{
                list.add(s);
            }
        }

        for(int i=0; i<list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }

}
