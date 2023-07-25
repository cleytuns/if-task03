import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		if (number1 % number2 == 0 || number2 % number1 == 0) {
			System.out.println("Multiplo");
		}
		else {
			System.out.println("Não Multiplo");
		}
		
		sc.close();
}
	}