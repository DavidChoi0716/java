import java.util.Scanner;

class EvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		System.out.println(number%2 == 0 ? "even" : "odd");
	}
}
