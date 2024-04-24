public class Pattern3_1
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

        for(;i <= rows;i++)
        {
            j = rows - i;
            for(;j > 0;j--)
            {
                System.out.print("  ");
            }
            int k = 1;
            for(;k <= i;k++)
            {
                System.out.print("*   ");
            }
            System.out.println();
        }

        i = rows - 1;
        for(;i > 0;i--)
        {
            j = rows - i;
            for(;j > 0;j--)
            {
                System.out.print("  ");
            }
            int k = 1;
            for(;k <= i;k++)
            {
                System.out.print("*   ");
            }

            System.out.println();
        }
    }
}
