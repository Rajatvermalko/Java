class CeilingKunal
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

        while(start<=end)
        {
            mid = (start + (end - start)) / 2;
            if (arr[mid] == n)
                System.out.println("The number " + n + " is found in the array at " + mid + " position");
            else if (n > arr[mid])
                start = mid + 1;
            else if (n < arr[mid])
                end = mid - 1;
        }
    System.out.println("The Ceilling number is found in the array at " + Start + " position");
}
