import java.util.Scanner;

class Calculator 
{
	public static void main(String[] args)
	{
		System.out.println("User! please enter the values");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int h=scan.nextInt();
		Numbers(n,h);
	}
	public static void Numbers(int a,int b)
	{
		System.out.println("The sum value is"+(a+b));
		System.out.println("The sub value is"+(a-b));
		System.out.println("The mul value is"+(a*b));
		System.out.println("The quo value is"+(a/b));
		System.out.println("The rem value is"+(a%b));
	}

}
