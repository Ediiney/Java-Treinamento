import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int number = scan.nextInt();
		int soma = 0;
		
		for (int i = 0; i < number; i++) {
			int x = scan.nextInt();
			soma += x;
		}
		
		System.out.println(soma);
	}

}
