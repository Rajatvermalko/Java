import java.util.Scanner;

public class Prime
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        System.out.print("Enter a number to check if it is prime number ");
        int num = sc.nextInt();
        if (num==0 || num==1)
            System.out.println(num + " Not a prime number");
        else
        {
            int i=2;
            while (i<=(num/2))
            {
                if (num%i == 0)
                {
                    System.out.println(num + " Not a prime number");
                    flag=1;
                }
                i++;
            }
        }
        if(flag==0)
            System.out.println(num+" is a prime number");
    }
}

