package Objectives_1_week;

public class Objective_2 
{
    public static void main(String args[])
    {
       int k = 1;
        
       for (int i = 25; k <= 25; k++)
        {
            if (k == 1 || k == 7 || k == 9 || k == 13 || k == 17 || k == 19 || k == 21 || k == 25)
            {
                System.out.print("* ");
            }
            
            else if (k == 5)
            {
                System.out.println("* ");
            }
                               
            else if (k == 10)
            {
                System.out.println(k + "  ");
            }
            
            else if (k == 15)
            {
                System.out.println(k + "  ");
            }
            
            else if (k == 20)
            {
                System.out.println(k + "  ");
            }
            else
            {
            System.out.print(k + "  ");
            }
        }
    }
}

/*
*  2  3  4  * 
 6  *  8  * 10 
11 12  * 14 15 
16  * 18  * 20 
 * 22 23 24  * 
*/