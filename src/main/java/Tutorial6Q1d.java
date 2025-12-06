public class Tutorial6Q1d
{
    public static boolean isPentagon(int number)
    {
        if (number<=0)
        {
            return false;
        }

        int n=1;
        int currentpentagon=1;

        while(currentpentagon<=number)
        {
            if(currentpentagon==number) //check the first one satisfy or not first before proceed to the next n
            {
                return true;
            }
            n++;
            int difference = (3*n)-2;
            currentpentagon += difference;
        }
        return false;
    }

    public static void main(String args[])
    {
        System.out.println(isPentagon(22));
    }
}
