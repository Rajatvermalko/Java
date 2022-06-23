//Wap to sort array by both selection and bubble sort method

//You can choose to Sort array in selection and bubble sort method

import java.util.Arrays;
import java.util.Scanner;

public class SelecBubbleSort
{
    public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter 0 to QUIT, ");
    System.out.print("Enter 1 to sort array in Bubble Sort Method, ");
    System.out.print("Enter 2 to sort array in Selection Sort Method: ");
    int inp=sc.nextInt();                                                               //USER enter his/her choice
    System.out.print("Enter the length of the array: ");
    int len=sc.nextInt();                                                                   //to length of the array
    int []arr = new int[len];
    System.out.print("Enter the array: ");
    for (int i=0;i<len;i++)
    {
        arr[i]=sc.nextInt();                                                               //to input the elements in the array
    }
    choice(arr,len,inp);                                                                  //choice function will perform the desired task
    }

    public static void choice(int[] arr,int len,int choice)
    {

        if(choice==0)                                                                         //CHOICE for SORT
        {
            System.exit(0);                                                                    //exit when user chooses to quit 
        }
        else if(choice==1)
        {
            System.out.print("Bubble Sort: ");
            int[] sorted=bubblesort(arr,len);
            System.out.println(Arrays.toString(sorted));
        }
        else if(choice==2)
        {
            System.out.print("Selection Sort: ");
            int[] selesort=selectionsort(arr,len);
            System.out.println(Arrays.toString(selesort));
        }
        else
        {
            System.out.print("INVALID INPUT ");
            System.exit(0);
        }

    }
    static int[] selectionsort(int[] arr,int len)
    {
        for (int i = 0; i < len; i++)
        {
            int flag=0;
            for (int j = 0; j < len; j++)
            {
                if (arr[i] < arr[j])
                {
                    swap(arr,i,j);
                    flag++;
                }
            }
            if (flag==0)
                break;
        }
    return arr;
    }
    static int[] bubblesort(int[] arr,int len)
    {
        for (int i=0;i<len;i++)
        {
            int flag=0;
            for (int j=1;j<len;j++)
            {
                if(arr[j-1]>arr[j])
                {
                    swap(arr,(j-1),j);
                    flag++;
                }
            }
            if (flag==0)
                break;
        }
        return arr;
    }

    static void swap(int[]arr,int i,int j)
    {
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}
