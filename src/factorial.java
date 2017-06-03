import java.util.Scanner;


public class factorial {

	public static void main(String[] args) {

Scanner consoleinput = new Scanner(System.in);
System.out.println("enter the number to calculate its factorial");

int n = consoleinput.nextInt();
int fact =1;

for(int i=1;i<=n;i++)
{
	fact=fact*i;
}
System.out.println(fact);

	}

}
