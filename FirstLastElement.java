import java.util.Scanner;

public interface FirstLastElement
{
    static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("First Enter the size of array and then ascending sorted elements in the array: ");
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter the number you want to find out in the array: ");
        int n = sc.nextInt();
        int[] answer={-1,-1};
        answer = searchRange(arr, n);
        for (int a : answer)
            System.out.print(a);
    }

    static int[] searchRange(int[] nums, int target)
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
