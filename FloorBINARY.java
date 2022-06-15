//WAP to find out the floor number in the array
// take necessary inputs from user
import java.util.Scanner;

public class FloorBINARY
{
    public static void main(String[] args)                          //main function
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("First Enter the size of array and then ascending sorted elements in the array: ");
        int[] arr = new int[sc.nextInt()];                         //to input the array from user
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();                                 //to input number to find in the array
        System.out.print("Enter the number you want to find out in the array: ");
        System.out.println(FloorBINARY.calc(sc.nextInt(), arr)+ " - is the floor number");   //function calling and printing the answer
    }
        public static int calc(int n,int[] a)                      //calc function to calculate the floor number in the array
        {
        int start = 0, end = a.length- 1, mid;                    //calculations and logic to find out the floor number
        while(start<end)
        {
            mid=(start+(end-start))/2;
            if(a[mid]==n)
                return n;
            else if(n>a[mid])
            {
               if(n<a[mid+1] && n>a[mid])
                   return a[mid];
               start=mid+1;
            }
            else if(n<a[mid])
            {
              if(n<a[mid] && n>a[mid-1])
                  return a[mid-1];
             end=mid-1;
            }
        }
            return 0;
        }
}
