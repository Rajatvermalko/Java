import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.System.in;

public class LinearSearch
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(in);
        System.out.println("Enter the size of arrays and then the array ");
        int[] arr=new int[sc.nextInt()];
        for (int i=0;i<arr.length;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter the number you need to find in the array: ");
        int n = sc.nextInt();
        int flag=0;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]==n)
                flag++;
        }
        if (flag>0)
            System.out.println("Number "+n+" is "+flag+" times present in the array.");
        else
            System.out.println("Given Number is not present in the array");
}
}
