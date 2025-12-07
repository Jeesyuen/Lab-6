import java.util.Random;
public class Tutorial6Q1f
{
    public static int [] RandomNumber()
    {
        Random random = new Random();
        int [] numbers = new int [10];
        for(int i=0; i<10; i++)
        {
            numbers[i]= random.nextInt(101);
        }
        return numbers;
    }
    public static void main(String[] args)
    {
       int[]numbers = RandomNumber();
       System.out.println(numbers[0]);
    }

}
