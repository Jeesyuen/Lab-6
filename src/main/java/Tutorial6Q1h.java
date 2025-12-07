import java.util.Random;
public class Tutorial6Q1h
{
    public static int RandomNum()
    {
        boolean [] Numbersthatappeared= new boolean [11];
        Random random = new Random();
        do
        {
            int number = random.nextInt(11);
            System.out.println(number + " ");
            if(Numbersthatappeared[number])
            {
                return number;
            }
            else
            {
                Numbersthatappeared[number]=true;
            }
        }
        while(true);
    }
    public static void main(String[] args)
    {
        int duplicate= RandomNum();
        System.out.println("Duplicated number: " + duplicate);

    }
}
