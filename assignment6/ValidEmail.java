import java.util.Scanner;

public class ValidEmail {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email: ");
        String str = sc.nextLine();

        if(isValidEmail(str)) System.out.println("Email is valid.");
        else System.out.println("Email is invalid.");
    }

    public static boolean isValidEmail(String str)
    {
        if(Character.isDigit(str.charAt(0)) || str.charAt(0) == '.')
        {
            return false;
        }

        if(str.endsWith("."))
        {
            return false;
        }

        int index = -1;

        //check for @
        if(str.contains("@")) 
        {
            index = str.indexOf("@");
        }

        else
        {
            return false;
        }

        String[] arr = str.split("@");

        if(arr.length != 2) 
        {
            return false;
        }

        if(arr[0].endsWith("."))
        {
            return false;
        }

        for(int i = 0; i < arr[0].length(); i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
            {
                return false;
            }

            if(i != arr[0].length() - 1 && (str.charAt(i) == '.' && str.charAt(i + 1) != '.'))
            {
                continue;
            }

            if(!Character.isLetterOrDigit(str.charAt(i)))
            {
                return false;
            }
        }

        if(arr[1].charAt(0) =='.')
        {
            return false;
        }

        //System.out.println(arr[1]);

        int dotCount = 0;

        for(int i = 0; i < arr[1].length(); i++)
        {
            if(arr[1].charAt(i) == '.') dotCount++;
        }

        //System.out.println(dotCount);

        if (dotCount > 2)
        {
            return false;
        }

        for(int i = 0; i < arr[1].length(); i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
            {   System.out.println(0);
                return false;
            }

            if(i < arr[1].length() - 1 && (arr[1].charAt(i) == '.' && arr[1].charAt(i + 1) != '.'))
            {
                continue;
            }

            if(!Character.isLetter(arr[1].charAt(i)))
            {
                return false;
            }
        }

        return true;
    }

}