import java.util.Scanner;
public class Tutorial6Q1e
{
    public static void num(String sentence)
    {
        int letter=0;
        int digit=0;
        for(int i=0;i<sentence.length();i++)
        {
           char c = sentence.charAt(i);
           if(Character.isLetter(c))
           {
               letter++;
           }
           else if(Character.isDigit(c))
           {
               digit++;
           }
        }
        System.out.println("The total letters are: " + letter );
        System.out.println("The total digits are: "+ digit);

    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence with letters and digits:");
        String sentence = input.nextLine().strip();
        num(sentence);
    }
}

