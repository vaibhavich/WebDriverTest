import java.util.Scanner;


public class fabonacci {

/*
	public static void main(String[] args) {
		int next, first =0,second =1; 
		System.out.println("enter nuber of terms");
			//wht is meaning of below line??
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i=0;i<=n;i++)
		{
			if(i<=1)
			next  = i;
			else
				next = first+second;
				first = second;
				second = next;
		System.out.print(next);
		
		}
*/

//by recursion
		 
			 static int n1=0,n2=1,n3=0;    
			 static void printFibonacci(int count){    
			    if(count>0){    
			         n3 = n1 + n2;    
			         n1 = n2;    
			         n2 = n3;    
			         System.out.print(" "+n3);   
			         printFibonacci(count-1);    
			     }    
			 }    
			 public static void main(String args[]){    
			  int count=10;    
			  System.out.print(n1+" "+n2);//printing 0 and 1    
			  printFibonacci(count-2);//n-2 because 2 numbers are already printed   
	}

}
