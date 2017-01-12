package DEITEL.Exercisesfrompage198;

/**
 * Created by wosker4yan on 03.12.16.
 */

public class Assignment6
{
    public static void main(String args[])
    {
        System.out.println("Exercise 1");
        loopa();
        System.out.println("Exercise 2");
        loopb();
        System.out.println("Exercise 3");
        loopc();
        System.out.println("Exercise 4");
        loopd();
    }
    static void loopa()
    {
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void loopb()
    {
        for(int i=10;i>=0;i--)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void loopc()
    {
        for(int i=0;i<=10;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=10;k>=i;k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void loopd()
    {
        for(int i=0;i<10;i++)
        {
            for(int j=10;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}