import java.util.Arrays;
import java.util.Scanner;

public class SelecBubbleSort
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int len=sc.nextInt();
        int []arr = new int[len];
        System.out.print("Enter the array: ");
        for (int i=0;i<len;i++) {
            arr[i]=sc.nextInt();
        }
        int[] a = arr;                                                  
        System.out.print("Bubble Sort: ");
        int[] sorted=bubblesort(arr,len);
        System.out.println(Arrays.toString(sorted));

        System.out.print("Selection Sort: ");
        int[] selesort=selectionsort(a,len);
        System.out.println(Arrays.toString(selesort));
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
