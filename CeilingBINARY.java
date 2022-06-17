//WAP to find out the ceiling number in the array
//try BIANRY SEARCH method for the task

import java.util.Scanner;

public class CeilingBINARY
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("First Enter the size of array and then ascending sorted elements in the array: ");
        int[] arr = new int[sc.nextInt()];            //declaring the array of user defined size
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();                    //initilization of the array with user defined sorted elements 
        System.out.print("Enter the number you want to find out in the array: ");
        int n = sc.nextInt();
        int start = 0, end = arr.length - 1, mid, flag;

        for (int i = 0; i < arr.length; i++) 
        {
            mid = (start + (end - start)) / 2;
            if (arr[mid] == n)
                System.out.println("The number " + n + " is found in the array at " + mid + " position");
            else if (n > arr[mid])
                start = mid + 1;
            else if (n < arr[mid])
                end = mid - 1;
            else if (n > arr[mid] && n < arr[mid + 1]) 
            {
                System.out.println("the Ceiling number of " + n + " is " + arr[mid + 1]+"at the position " + (mid + 1));
                break;
            } 
            else if (n < arr[mid] && n > arr[mid - 1])
            {
                System.out.println("the Ceiling number of " + n + " is " + arr[mid]+"at the position " + mid);
                break;
            }
          
        }
    }
}
