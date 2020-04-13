import java.util.Scanner;

class IfMoreThan50OrNot
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		if (a >= 50){
			System.out.println("more than 50");
		} else {
			System.out.println("under 50");
		}
	}
}
