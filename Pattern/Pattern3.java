public class Pattern3
{
    /*====================================================

                                  *
                                *   *
                              *   *   *
                            *   *   *   *
                          *   *   *   *   *
                        *   *   *   *   *   *
                      *   *   *   *   *   *   *
                     *  *   *   *   *   *   *   *
                      *   *   *   *   *   *   *
                        *   *   *   *   *   *
                          *   *   *   *   *
                            *   *   *   *
                              *   *   *
                                *   *
                                  *

    ====================================================*/
    public static void main(String[] args)
    {
        int rows = 8;

        int i = 1;
        int j = 0;

        while(i <= rows)
        {
            j = rows - i;
            while(j > 0)
            {
                System.out.print("  ");
                j--;
            }
            int k = 1;
            while (k <= i)
            {
                System.out.print("*   ");
                k++;
            }
            System.out.println();
            i++;
        }
        i = rows - 1;
        while(i > 0)
        {
            j = rows - i;
            while (j > 0)
            {
                System.out.print("  ");
                j--;
            }
            int k = 1;
            while (k <= i) {
                System.out.print("*   ");
                k++;
            }
            System.out.println();
            i--;
        }
    }
}
