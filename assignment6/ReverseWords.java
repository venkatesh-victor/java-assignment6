import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        String[] arr = str.split(" ");
        String res = "";

        for(int i = arr.length - 1; i >= 0; i--)
        {
            res += arr[i] + " ";
        }

        System.out.println(res);
    }
}
