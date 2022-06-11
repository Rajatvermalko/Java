// To perform a BINARY SEARCH in ascending sorted array

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, str = 0, flag = 0,mid = 0;
        System.out.println("Enter the size of arrays and then the array ");
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter the number you need to find in the array: ");
        n = sc.nextInt();
        int end =arr.length-1;
        while (str <= end)
        {
            mid = str+(end-str)/2;
            if (n==arr[mid])
            {
                flag = 1;
                break;
            }
            else
            {
                if (n > arr[mid])
                    str = mid + 1;
                else
                    end = mid - 1;
            }
        }
        if(flag==1)
        System.out.println("Number " +n+ " is present at index " +mid);
        else
            System.out.println("Invalid Input! Number is not present in the array");

    }
}
