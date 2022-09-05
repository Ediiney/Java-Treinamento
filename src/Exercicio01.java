import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int senha = 2002;
		int input = scan.nextInt();
		
		while (input != senha) {
			System.out.println("Senha Invalida");
			input = scan.nextInt();
		}
		
		if (input == senha) {
			System.out.println("Acesso permitido");
		} else {
			System.out.println("Senha Invalida");
		}

	}

}
