import java.util.Scanner;

class Avg3Integer 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a<40 || b<40 || c<40) System.out.println("Fail");
		else if ((a+b+c)/3 >= 70) System.out.println("Pass");
		else System.out.println("Non-Pass");
	}
}
