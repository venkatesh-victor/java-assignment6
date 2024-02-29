import java.util.Scanner;
import java.util.Arrays;

public class Capitalize {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String res = "";

        String[] arr = str.split(" ");

        for(int i = 0; i < arr.length; i++)
        {
            String temp = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1) + " ";
            res += temp;
        }

        System.out.println(res);

        //System.out.println(Arrays.toString(arr));
        
    }
}
