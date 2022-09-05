import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int minutos;
		double plano = 50.00;
		double taxa = 2.00;
		
		
		minutos = scan.nextInt();
		
		if (minutos <= 100) {
			double conta = plano;
			System.out.printf("Valor a pagar R$: " + conta);
		} else {
			double conta = (minutos - 100) * taxa + plano;
			System.out.printf("Valor a pagar R$: " + conta);
		}
	}

}
