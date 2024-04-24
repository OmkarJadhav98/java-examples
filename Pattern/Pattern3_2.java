public class Pattern3_2
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

        do
        {
            j = rows - i;
            int k = 1;
            do
            {
                System.out.print("  ");
                j--;
            }while(j >= 0);

            do
            {
                System.out.print("*   ");
                k++;
            }while (k <= i);

            System.out.println();
            i++;
        }while(i <= rows);

        i = rows - 1;
        do
        {
            j = rows - i;
            do
            {
                System.out.print("  ");
                j--;
            }while (j >= 0);

            int k = 1;
            do
            {
                System.out.print("*   ");
                k++;
            }while (k <= i);

            System.out.println();
            i--;
        }while(i > 0);
    }
}

