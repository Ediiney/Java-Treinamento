import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int x = scan.nextInt();
		
		for (int i = 1; i <= x && x <= 1000; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

	}

}
