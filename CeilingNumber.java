import java.util.Scanner;

public class CeilingNum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("First Enter the size of array and then ascending sorted elements in the array: ");
        int[] arr=new int[sc.nextInt()];
        for (int i=0;i<arr.length;i++)
            arr[i]= sc.nextInt();
        System.out.print("Enter the number you want to find out in the array: ");
        int n=sc.nextInt();

        for (int j=1;j<arr.length;j++)
        {
            if (arr[j-1]<=n && n<=arr[j])
            {
                System.out.println("For the number "+n+", The Ceiling number is "+arr[j]);
                break;
            }
        }
        
    }
}
