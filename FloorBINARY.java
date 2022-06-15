import java.util.Scanner;

public class FloorBINARY
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("First Enter the size of array and then ascending sorted elements in the array: ");
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter the number you want to find out in the array: ");
        System.out.println(FloorBINARY.calc(sc.nextInt(), arr)+ " - is the floor number");
    }
        public static int calc(int n,int[] a)
        {
        int start = 0, end = a.length- 1, mid;
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
            return start;
        }
}
