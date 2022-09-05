import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Quantos numeros aleatorios você quer?");
		int n = scan.nextInt();
		System.out.println("Digite o intervalo de numeros aleatorios: ");
		int range = scan.nextInt();
		Random random = new Random();
		
		for (int i = 0; i < n; i ++) {
			
			System.out.println(random.nextInt(range));
		}
	}

}
