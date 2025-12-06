public class Tutorial6Q1c
{
    public static long factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            long result=1;
            for(int i=1; i<=n;i++)
            {
                result*=i;
            }
            return result;
        }
    }

    public static long combination(int n, int k)
    {
        if(k<0 || n<0 || k>n)
        {
            return 0;
        }
        else if(k==0 || k==n)
        {
            return 1;
        }
        else
        {
            long numerator = factorial(n);
            long denominator= factorial(k)* factorial(n-k);
            return numerator/denominator;
        }
    }
    public static void main(String [] args)
    {
        System.out.println(combination(5,2));
    }
}
