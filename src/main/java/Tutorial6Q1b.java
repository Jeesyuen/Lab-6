public class Tutorial6Q1b
{
    public static boolean square(int n)
    {
        if(n<0)
        {
            return false;
        }
        int squareroot=(int)Math.sqrt(n);
        return squareroot * squareroot==n;
    }
    public static void main(String[] args)
    {
        System.out.println(square(26));
    }
}
