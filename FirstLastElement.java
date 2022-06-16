//WAP to find the given element in the array 
//and give the first and last  position of its occurence
//input {2,3,7,7,7,8,8,9} and 7
//--> answer is {2,4}

import java.util.Scanner;                                                     //import statement for util package

public interface FirstLastElement
{
    static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("First Enter the size of array and then ascending sorted elements in the array: ");
        int[] arr = new int[sc.nextInt()];                                      //input the size of the array to declare
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();                                              //input the elements in the array
        System.out.print("Enter the number you want to find out in the array: ");
        int n = sc.nextInt();                                                   //user inputs the element to search in the array
        int[] answer={-1,-1};
        answer = searchRange(arr, n);                                           //function calling to find the elements first and last position
        for (int a : answer)
            System.out.print(a);                                               //print the answer 
    }

    static int[] searchRange(int[] nums, int target)                           //function to catch the return and return the values
    {
        int[] ans = {-1, -1};
        // check for first occurrence if target first
        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);
        return ans;
    }

    static int search(int[] nums, int target, boolean findStartIndex)                   // this function just returns the index value of target
    {
        int ans=-1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end)
        {
            // find the middle element
            int mid = start + (end - start) / 2;
            if (target < nums[mid])
            {
                end = mid - 1;
            }
            else if (target > nums[mid])
            {
                start = mid + 1;
            }
            else
            {                                                                 // potential answer found
                ans = mid;
                if (findStartIndex)
                {
                    end = mid - 1;
                } else
                {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
