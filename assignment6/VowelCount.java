import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        int count = 0;

        for(int i = 0; i < str.length(); i++)
        {
            if(isVowel(str.charAt(i)))
            {
                count++;
            }
        }

        System.out.println("This string has " + count + " vowels");
    }

    public static boolean isVowel(char c)
    {
        Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
