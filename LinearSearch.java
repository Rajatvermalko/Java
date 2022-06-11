//To Find the number in the user defined array through linear search
import java.util.Scanner;
import static java.lang.System.in;

public class LinearSearch
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(in);
        System.out.println("Enter the size of arrays and then the array ");
        int[] arr=new int[sc.nextInt()];            //initialization of user defined array
        for (int i=0;i<arr.length;i++)
        arr[i]=sc.nextInt();                       //taking inputs in the array
        System.out.println("Enter the number you need to find in the array: ");
        int n = sc.nextInt();                      // inputing the number we want to find in the array
        int flag=0;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]==n)
                flag++;                            //updating flag when number is found in the array
        }
        if (flag>0)
            System.out.println("Number "+n+" is "+flag+" times present in the array.");
        else
            System.out.println("Given Number is not present in the array");
}
}
