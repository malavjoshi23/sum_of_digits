import org.w3c.dom.ls.LSOutput;

import java.util.*;


public class sum_of_digits {
    public static void main(String[] args) {


        System.out.println("Enter number of inputs");
    Scanner sc= new Scanner(System.in);
    int no_of_input = sc.nextInt();

    int rem=0;
        int num[]= new int[no_of_input];
        System.out.println("Enter numbers");
    for(int i=0;i<no_of_input;i++ )
    {
        num[i]=sc.nextInt();

    }

    for(int i=0;i<no_of_input;i++ )
    {
        int sum=0;
        while(num[i]>0)
        {
            rem=num[i]%10;
            sum=sum+rem;
            num[i]=num[i]/10;

        }
        System.out.println(sum);
    }
    }

}
