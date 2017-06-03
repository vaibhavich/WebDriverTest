import java.io.PrintStream;
import java.util.Scanner;


public class printTable
{

public static void main(String[] args)
{
/*
for (int a = 1; a <= 20; a++)
{
	for(int b=1;b<=10;b++)
	{
		int result = a * b;
		System.out.println(a + " * " + b + " = " + result);
	}
}
*/

//using console

    System.out.println("Enter an integer to print multiplication table till integer value");
    Scanner consoleinput = new Scanner(System.in);
    int n = consoleinput.nextInt();
    System.out.println("multiplication table till integer "+n+" is :-");
    
    for(int a=1; a<=n; a++ )
    {
    	for(int b=1; b<=10; b++)
    	{
    		int result = a*b;
    		System.out.println(a+ "*" + b + "=" +result);
    	}
    }

	
	/*
	 // print table by giving value
	 int n, c;
     System.out.println("Enter an integer to print it's multiplication table");
     Scanner in = new Scanner(System.in);
     n = in.nextInt();
     System.out.println("Multiplication table of "+n+" is :-");

     for ( c = 1 ; c <= 10 ; c++ )
        System.out.println(n+"*"+c+" = "+(n*c));

*/


}
}