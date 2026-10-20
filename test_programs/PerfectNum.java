public class PerfectNum
{
    public static void main(String[] args)
    {
        final int N = 1000000;
        int i, j, suma;
        for (i = 1; i <= N; i++)
        {
            suma = 0;
            for (j = 1; j < i; j++)
            {
                 if (i % j==0)
                 {
                    suma = suma + j;
                 }
            }
          if (i == suma)
          {
             System.out.println(i);
          }
        }
    }
}
