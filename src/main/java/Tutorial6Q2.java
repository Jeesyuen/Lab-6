import java.util.Random;
public class Tutorial6Q2
{
    public static void RandomNum()
    {
        Random random= new Random();
        int [] nums= new int [3];
        for(int i=0; i<nums.length; i++)
        {
            nums[i] = random.nextInt(101);
        }
        for (int i=0; i<nums.length; i++)
        {
            for(int j=0; j<nums.length-1;j++)
            {
                if(nums[j]<nums[j+1])
                {
                    int tempnum= nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=tempnum;
                }
            }
        }
        System.out.println("Decreasing order: ");
        for(int k=0; k<nums.length;k++)
        {
            System.out.print(nums[k] + " ");
        }

    }
    public static void main(String [] args)
    {
       RandomNum();
    }
}
