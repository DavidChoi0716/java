import java.util.Scanner;

class BMI 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("pleas put your height(m)");
		double a = sc.nextDouble();
		
		System.out.println("pleas put your weight(kg)");
		double b = sc.nextDouble();
		
		double bmi = b / (a*a);

		if (bmi <= 18.5) {
			System.out.println("a");
			} else if (bmi > 18.5 && bmi <= 25){
				System.out.println("b");
			} else if (bmi > 25 && bmi <= 30) {
				System.out.println("c");
			} else if (bmi > 30 && bmi <= 40) {
				System.out.println("d");
			} else {
				System.out.println("e");
			}

	}
}
